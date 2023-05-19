package com.sopt.SopkathonServer.api.member.service;

import com.sopt.SopkathonServer.api.member.domain.Member;
import com.sopt.SopkathonServer.api.member.repository.MemberRepository;
import com.sopt.SopkathonServer.common.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.sopt.SopkathonServer.common.response.ErrorStatus.MEMBER_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional(readOnly = true)
    public Member getMember(Long memberId) {
        return memberRepository.findById(memberId)
                .orElseThrow(() -> new BusinessException(MEMBER_NOT_FOUND));
    }

}
