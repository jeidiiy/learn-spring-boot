package com.wscrg.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// 각 멤버에 대한 게터 메서드를 자동 생성해주는 어노테이션
@Getter
// 생성자를 자동 생성해주는 어노테이션
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
