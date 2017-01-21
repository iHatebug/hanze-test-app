package com.hanze.service;

import com.hanze.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Hanze on 21/01/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup(){
        User user = new User();
        user.setName("Hanze");
        user.setEmail("123456@gmail.com");
        userRepository.save(user);
    }

    @Test
    public void shouldFindUserByName(){
        List<User> userList = userRepository.findByName("Hanze");
        assertThat("123456@gmail.com".equals(userList.get(0).getEmail()));
    }
}
