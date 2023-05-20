package com.sopt.SopkathonServer.api.post.dto.response;

import com.sopt.SopkathonServer.api.comment.domain.Comment;
import com.sopt.SopkathonServer.api.comment.dto.response.CommentResponseDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostResponseDetailDto {
    private Long postId;
    private String stationName;
    private String title;
    private String content;
    private Integer likeCnt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<CommentResponseDto> comments;

    public static PostResponseDetailDto of(
            Long postId
            , String stationName
            , String title
            , String content
            , Integer likeCnt
            , LocalDateTime createdAt
            , LocalDateTime updatedAt
            , List<CommentResponseDto> comments
    ) {
        return new PostResponseDetailDto(postId, stationName, title, content, likeCnt, createdAt, updatedAt, comments);
    }
}
