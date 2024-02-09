package com.rest.board.mapper;

import com.rest.board.account.repository.mybatis.UserMapper;
import com.rest.board.account.vo.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MapperTest {

    @Autowired
    private UserMapper mapper;
    @Test
    @DisplayName("모든유저 목록 찾기")
    void getAllUser() {
        List<User> user = mapper.findAll();

        Assertions.assertThat(user.get(0).getName()).isEqualTo("jaehoon");
        Assertions.assertThat(user.get(1).getLoginId()).isEqualTo("dahee");
    }

    @Test
    @DisplayName("id에 따른 유저 찾기")
    void getUserById() {
        User user = mapper.findById(1L);

        Assertions.assertThat(user.getName()).isEqualTo("jaehoon");

        User user2 = mapper.findById(2L);

        Assertions.assertThat(user2.getLoginId()).isEqualTo("dahee");

    }
}
