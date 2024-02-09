package com.rest.board.account.repository.mybatis;

import com.rest.board.account.dto.UserDto;
import com.rest.board.account.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// 추후 다른 DB 접근기술을 연결하기위해 repository로 작성
@Repository
public class UserMybatisRepository implements UserRepository {


    @Override
    public void saveUser(UserDto userDto) {

    }

    @Override
    public void updateUser(Long id, UserDto udpateUserDto) {

    }

    @Override
    public UserDto findById(Long id) {
        return null;
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }
}
