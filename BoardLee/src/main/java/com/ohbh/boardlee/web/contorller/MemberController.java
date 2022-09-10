package com.ohbh.boardlee.web.contorller;

import com.ohbh.boardlee.biz.entity.Member;
import com.ohbh.boardlee.biz.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberServiceImpl memberService;

    @ResponseBody
    @GetMapping("/member/{username}")
    public String getMember(@PathVariable String username) {
        memberService.getMember(username);
        return "test";
    }
}
