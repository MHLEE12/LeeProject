package com.ohbh.boardlee.biz.repository;

import com.ohbh.boardlee.biz.entity.Member;
import com.ohbh.boardlee.web.contorller.dto.MemberDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}
