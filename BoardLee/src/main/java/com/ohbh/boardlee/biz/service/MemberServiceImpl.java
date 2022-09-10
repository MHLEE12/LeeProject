package com.ohbh.boardlee.biz.service;


import com.ohbh.boardlee.biz.entity.Member;
import com.ohbh.boardlee.biz.repository.MemberRepository;
import com.ohbh.boardlee.web.contorller.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    public void getMember(String username) {
//        if (memberRepository.findByName(username).isEmpty()) {
//            return new MemberDto.Member();
//        }
        memberRepository.findByUsername(username).orElseThrow();

    }
}
