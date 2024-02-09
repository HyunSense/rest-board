package com.rest.board.account.repository;

import com.rest.board.account.dto.UserDto;

import java.util.List;

public interface UserRepository {

    void saveUser(UserDto userDto);

    void updateUser(Long id, UserDto udpateUserDto);

    UserDto findById(Long id);

    List<UserDto> findAll();

}
