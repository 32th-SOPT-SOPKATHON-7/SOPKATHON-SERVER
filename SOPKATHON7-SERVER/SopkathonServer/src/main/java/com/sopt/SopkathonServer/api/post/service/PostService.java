package com.sopt.SopkathonServer.api.post.service;

import com.sopt.SopkathonServer.api.post.domain.Post;
import com.sopt.SopkathonServer.api.post.dto.PostRequestDto;
import com.sopt.SopkathonServer.api.post.dto.response.PostResponseDto;
import com.sopt.SopkathonServer.api.post.repository.PostRepository;
import com.sopt.SopkathonServer.api.station.domain.Station;
import com.sopt.SopkathonServer.api.station.dto.HotPostDto;
import com.sopt.SopkathonServer.api.station.dto.StationListDto;
import com.sopt.SopkathonServer.api.post.dto.PostRequestCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.sopt.SopkathonServer.api.station.repository.StationRepository;
import com.sopt.SopkathonServer.common.exception.BusinessException;
import com.sopt.SopkathonServer.common.response.ErrorStatus;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
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
}
