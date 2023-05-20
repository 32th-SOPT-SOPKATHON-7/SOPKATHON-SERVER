package com.sopt.SopkathonServer.api.station.service;

import com.sopt.SopkathonServer.api.post.domain.Post;
import com.sopt.SopkathonServer.api.post.repository.PostRepository;
import com.sopt.SopkathonServer.api.station.domain.Station;
import com.sopt.SopkathonServer.api.station.dto.HotPostDto;
import com.sopt.SopkathonServer.api.station.dto.StationListDto;
import com.sopt.SopkathonServer.api.station.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class StationService {
    private final StationRepository stationRepository;
    private final PostRepository postRepository;

    public StationListDto getMain() {
        //* 핫 게시물 가져오기
        List<Post> postList = postRepository.findAllByOrderByLikeCntDesc();
        HotPostDto hotPost = HotPostDto.of(postList.get(0));

        //* 각 station 별로 게시물의 좋아요 수가 10개 이상인 station만 내려주기
        List<Station> stations = stationRepository.findAllWithTotalLikesGreaterThanTen();
        return StationListDto.of(hotPost, stations);
    }

}
