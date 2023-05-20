package com.sopt.SopkathonServer.api.post.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostResponseDto {

    private Long postId;
    private String stationName;
    private String title;
    private String content;
    private Integer likeCnt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static PostResponseDto of(
            Long postId
            , String stationName
            , String title
            , String content
            , Integer likeCnt
            , LocalDateTime createdAt
            , LocalDateTime updatedAt
    ) {
        return new PostResponseDto(postId, stationName, title, content, likeCnt, createdAt, updatedAt);
    }
}
