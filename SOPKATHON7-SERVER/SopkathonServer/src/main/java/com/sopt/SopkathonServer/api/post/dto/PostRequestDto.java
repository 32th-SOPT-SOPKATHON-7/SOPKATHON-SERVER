package com.sopt.SopkathonServer.api.post.dto;

import com.sopt.SopkathonServer.api.post.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class PostRequestDto {
    private Long postId;
    private String postTitle;
    private String postContent;
    private LocalDateTime postCreatedAt;
    private int postCommentCnt;
    private int postLikeCnt;

    public static PostRequestDto of (Post post) {
        return new PostRequestDto(post.getId(), post.getTitle(), post.getContent(), post.getCreatedAt(), post.getCommentList().size(), post.getLikeCnt());
    }
}
