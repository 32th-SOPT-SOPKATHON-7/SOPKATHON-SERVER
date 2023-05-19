package com.sopt.SopkathonServer.api.member.repository;

import com.sopt.SopkathonServer.api.member.domain.Member;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface MemberRepository extends Repository<Member, Long> {
    void save(Member member);
    Optional<Member> findById(Long id);
}
