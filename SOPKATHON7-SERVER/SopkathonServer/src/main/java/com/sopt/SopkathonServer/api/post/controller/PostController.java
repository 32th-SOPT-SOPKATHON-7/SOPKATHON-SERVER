package com.sopt.SopkathonServer.api.post.controller;

import com.sopt.SopkathonServer.api.post.dto.PostRequestCreateDto;
import com.sopt.SopkathonServer.api.post.dto.response.PostResponseDto;
import com.sopt.SopkathonServer.api.post.service.PostService;
import com.sopt.SopkathonServer.common.dto.ApiResponseDto;
import com.sopt.SopkathonServer.common.response.SuccessStatus;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    @PostMapping("/create")
    public ApiResponseDto orderAdd(
            @RequestBody PostRequestCreateDto createDto
    ) {
        return ApiResponseDto.success(SuccessStatus.POST_CREATE_SUCCESS, postService.addPost(createDto)) ;
    }
}
