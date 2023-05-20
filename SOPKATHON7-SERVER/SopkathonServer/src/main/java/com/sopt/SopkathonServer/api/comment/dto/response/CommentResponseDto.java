package com.sopt.SopkathonServer.api.comment.dto.response;

import com.sopt.SopkathonServer.api.post.dto.response.PostResponseDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CommentResponseDto {

    private Long commentId;
    private Long postId;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public static CommentResponseDto of(
            Long commentId
            , Long postId
            , String content
            , LocalDateTime createdAt
            , LocalDateTime updatedAt
    ) {
        return new CommentResponseDto(commentId, postId, content, createdAt, updatedAt);
    }
}
