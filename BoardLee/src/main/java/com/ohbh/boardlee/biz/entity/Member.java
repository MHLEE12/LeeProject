package com.ohbh.boardlee.biz.entity;

import com.ohbh.boardlee.biz.entity.enums.Authority;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@RequiredArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String name;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Builder
    public Member(Long id, String username,String password, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.authority = Authority.ROLE_USER;
    }
}
