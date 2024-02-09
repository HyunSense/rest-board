package com.rest.board.account.vo;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class User {

    private Long id;
    private String loginId;
    private String password;
    private String name;
    private String email;
    private LocalDateTime createdDate;
    private LocalDateTime loginDate;

}
