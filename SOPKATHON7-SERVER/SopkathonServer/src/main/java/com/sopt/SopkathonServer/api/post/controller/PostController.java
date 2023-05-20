package com.sopt.SopkathonServer.api.post.controller;

import com.sopt.SopkathonServer.api.post.dto.PostRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static lombok.AccessLevel.PRIVATE;

import com.sopt.SopkathonServer.api.post.dto.PostRequestCreateDto;
import com.sopt.SopkathonServer.api.post.service.PostService;
import com.sopt.SopkathonServer.common.dto.ApiResponseDto;
import com.sopt.SopkathonServer.common.response.SuccessStatus;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(access = PRIVATE)
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    @GetMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponseDto<List<PostRequestDto>> getAllByNew(@RequestParam String stationName) {
        return ApiResponseDto.success(SuccessStatus.GET_ALL_POST_NEW_SUCCESS, postService.getPostByNew(stationName));
    }

    @GetMapping("/trend")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponseDto<List<PostRequestDto>> getAllByTrend(@RequestParam String stationName) {
        return ApiResponseDto.success(SuccessStatus.GET_ALL_POST_TREND_SUCCESS, postService.getPostByTrend(stationName));
    }

    @PostMapping("/create")
    public ApiResponseDto orderAdd(
            @RequestBody PostRequestCreateDto createDto
    ) {
        return ApiResponseDto.success(SuccessStatus.POST_CREATE_SUCCESS, postService.addPost(createDto)) ;
    }

    @GetMapping("/detail/{postId}")
    public ApiResponseDto orderDetails(
            @PathVariable("postId") Long postId
    ){
        return ApiResponseDto.success(SuccessStatus.GET_POST_DETAIL, postService.getDetailPost(postId));
    }
}
