package com.sopt.SopkathonServer.api.member.dto;

import com.sopt.SopkathonServer.api.member.domain.Member;
import lombok.*;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class MemberResponseDto {
    private Long id;
    private String nickname;

    public static MemberResponseDto of(Member member) {
        return new MemberResponseDto(member.getId(), member.getNickname());
    }
}
