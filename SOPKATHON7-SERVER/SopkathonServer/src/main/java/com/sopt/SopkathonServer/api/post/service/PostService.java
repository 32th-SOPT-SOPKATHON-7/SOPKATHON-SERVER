package com.sopt.SopkathonServer.api.post.service;

import com.sopt.SopkathonServer.api.post.domain.Post;
import com.sopt.SopkathonServer.api.post.dto.PostRequestDto;
import com.sopt.SopkathonServer.api.post.repository.PostRepository;
import com.sopt.SopkathonServer.api.station.domain.Station;
import com.sopt.SopkathonServer.api.station.dto.HotPostDto;
import com.sopt.SopkathonServer.api.station.dto.StationListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PostService {

    private final PostRepository postRepository;

    public List<PostRequestDto> getPostByNew(String stationName) {
        List<PostRequestDto> result = new ArrayList<>();
        List<Post> posts = postRepository.findAllByOrderByCreatedAtDesc();

        for (Post post : posts) {
            if (post.getStation().getName().equals(stationName))
                result.add(PostRequestDto.of(post));
        }
        return result;
    }
}
