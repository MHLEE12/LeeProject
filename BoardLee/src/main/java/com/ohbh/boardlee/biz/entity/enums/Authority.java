package com.ohbh.boardlee.biz.entity.enums;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Authority {
    ROLE_ADMIN("관리자"), ROLE_USER("유저");

    private final String name;
}
