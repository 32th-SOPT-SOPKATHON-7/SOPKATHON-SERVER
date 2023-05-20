package com.sopt.SopkathonServer.api.comment.controller;

import com.sopt.SopkathonServer.api.comment.dto.request.CommentRequestCreateDto;
import com.sopt.SopkathonServer.api.comment.dto.response.CommentResponseDto;
import com.sopt.SopkathonServer.api.comment.service.CommentService;
import com.sopt.SopkathonServer.common.dto.ApiResponseDto;
import com.sopt.SopkathonServer.common.response.SuccessStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comments")
@Slf4j
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/create/{postId}")
    public ApiResponseDto<CommentResponseDto> addComment(
            @PathVariable("postId") Long postId
            , @RequestBody CommentRequestCreateDto createDto) {
        log.info(createDto.getContent());
        return ApiResponseDto.success(SuccessStatus.COMMENT_CREATE_SUCCESS, commentService.addComment(postId, createDto));
    }
}
