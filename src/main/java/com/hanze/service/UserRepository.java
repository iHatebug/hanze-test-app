package com.hanze.service;

import com.hanze.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Hanze on 21/01/2017.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByName(String name);
}
