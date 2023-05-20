package com.sopt.SopkathonServer.api.post.service;

import com.sopt.SopkathonServer.api.comment.dto.response.CommentResponseDto;
import com.sopt.SopkathonServer.api.comment.repository.CommentRepository;
import com.sopt.SopkathonServer.api.post.domain.Post;
import com.sopt.SopkathonServer.api.post.dto.PostRequestCreateDto;
import com.sopt.SopkathonServer.api.post.dto.response.PostResponseDetailDto;
import com.sopt.SopkathonServer.api.post.dto.PostRequestDto;
import com.sopt.SopkathonServer.api.post.dto.response.PostResponseDto;
import com.sopt.SopkathonServer.api.post.repository.PostRepository;
import com.sopt.SopkathonServer.api.station.domain.Station;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.sopt.SopkathonServer.api.station.repository.StationRepository;
import com.sopt.SopkathonServer.common.exception.BusinessException;
import com.sopt.SopkathonServer.common.response.ErrorStatus;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final StationRepository stationRepository;

    @Transactional
    public List<PostRequestDto> getPostByNew(String stationName) {
        List<PostRequestDto> result = new ArrayList<>();
        List<Post> posts = postRepository.findAllByOrderByCreatedAtDesc();

        for (Post post : posts) {
            if (post.getStation().getName().equals(stationName))
                result.add(PostRequestDto.of(post));
        }
        return result;
    }

    @Transactional
    public List<PostRequestDto> getPostByTrend(String stationName) {
        List<PostRequestDto> trendResult = new ArrayList<>();
        List<Post> posts = postRepository.findAllByOrderByLikeCntDesc();

        for (Post post : posts) {
            if (post.getStation().getName().equals(stationName))
                trendResult.add(PostRequestDto.of(post));
        }
        return trendResult;
    }


    @Transactional
    public PostResponseDto addPost(PostRequestCreateDto createDto) {
        Station findStation = stationRepository.findByName(createDto.getStationName()).orElseThrow(()-> new BusinessException(ErrorStatus.STATION_NOT_FOUND));
        Post savePost = Post.builder()
                .content(createDto.getContent())
                .likeCnt(0)
                .station(findStation)
                .title(createDto.getTitle())
                .build();
        Post savedPost = postRepository.save(savePost);
        return PostResponseDto.of(
                savedPost.getId()
                , savedPost.getStation().getName()
                , savedPost.getTitle()
                , savedPost.getContent()
                , savedPost.getLikeCnt()
                ,  savedPost.getCreatedAt()
                , savedPost.getUpdatedAt());
    }

    @Transactional
    public PostResponseDetailDto getDetailPost(final Long postId) {
        List<CommentResponseDto> commentList = commentRepository.findAllByPostId(postId)
                .stream().map(comment -> CommentResponseDto.of(
                        comment.getId()
                        , postId
                        , comment.getContent()
                        , comment.getCreatedAt()
                        , comment.getUpdatedAt()
                ))
                .collect(Collectors.toList());


        Post findPost = postRepository.findById(postId).orElseThrow(() -> new BusinessException(ErrorStatus.POST_NOT_FOUND));
        return PostResponseDetailDto.of(
                postId
                , findPost.getStation().getName()
                , findPost.getTitle()
                , findPost.getContent()
                , findPost.getLikeCnt()
                , findPost.getCreatedAt()
                , findPost.getUpdatedAt()
                , commentList
        );
    }
}
