package com.sopt.SopkathonServer.api.post.controller;

import com.sopt.SopkathonServer.api.post.dto.PostRequestDto;
import com.sopt.SopkathonServer.api.post.service.PostService;
import com.sopt.SopkathonServer.api.station.dto.StationListDto;
import com.sopt.SopkathonServer.common.dto.ApiResponseDto;
import com.sopt.SopkathonServer.common.response.SuccessStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor(access = PRIVATE)
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    @GetMapping("/trend")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponseDto<List<PostRequestDto>> getAllByTrend(@RequestParam String stationName) {
        return ApiResponseDto.success(SuccessStatus.GET_ALL_POST_TREND_SUCCESS, postService.getPostByTrend(stationName));
    }

}
