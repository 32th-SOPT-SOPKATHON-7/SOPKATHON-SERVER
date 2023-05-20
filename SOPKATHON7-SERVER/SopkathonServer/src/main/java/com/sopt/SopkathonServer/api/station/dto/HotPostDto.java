package com.sopt.SopkathonServer.api.station.dto;

import com.sopt.SopkathonServer.api.post.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class HotPostDto {
    private Long postId;
    private String title;
    private LocalDateTime createdAt;

    public static HotPostDto of (Post post) {
        return new HotPostDto(post.getId(), post.getTitle(), post.getCreatedAt());
    }

}
