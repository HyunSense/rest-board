package com.rest.board.account.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class UserDto {

    private Long id;
    private String loginId;
    private String password;
    private String name;
    private String email;

}
