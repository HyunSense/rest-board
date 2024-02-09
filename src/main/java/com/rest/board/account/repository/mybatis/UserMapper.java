package com.rest.board.account.repository.mybatis;

import com.rest.board.account.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();
    User findById(@Param("id") Long id);
}
