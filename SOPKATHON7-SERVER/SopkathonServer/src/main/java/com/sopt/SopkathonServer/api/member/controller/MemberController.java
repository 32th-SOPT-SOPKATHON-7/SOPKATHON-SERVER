package com.sopt.SopkathonServer.api.member.controller;

import com.sopt.SopkathonServer.api.member.domain.Member;
import com.sopt.SopkathonServer.api.member.dto.MemberResponseDto;
import com.sopt.SopkathonServer.api.member.service.MemberService;
import com.sopt.SopkathonServer.common.dto.ApiResponseDto;
import com.sopt.SopkathonServer.common.response.SuccessStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("")
    public ApiResponseDto<MemberResponseDto> getMemberProfile(Long memberId) {
        Member findMember = memberService.getMember(memberId);
        return ApiResponseDto.success(SuccessStatus.SIGNUP_SUCCESS, MemberResponseDto.of(findMember));
    }
}

