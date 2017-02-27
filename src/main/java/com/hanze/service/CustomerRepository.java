package com.hanze.service;

import com.hanze.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Hanze on 21/01/2017.
 */
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findByName(String name);
}
