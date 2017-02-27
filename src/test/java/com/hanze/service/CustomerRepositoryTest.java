package com.hanze.service;

import com.hanze.SpringBootSampleTest;
import com.hanze.domain.Customer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Hanze on 21/01/2017.
 */
public class CustomerRepositoryTest extends SpringBootSampleTest{

    @Autowired
    private CustomerRepository customerRepository;

    @Before
    public void setup(){
        Customer customer = new Customer();
        customer.setName("Hanze");
        customer.setPhone("1234567890");
        customerRepository.save(customer);
    }

    @Test
    public void shouldFindCustomerByName() throws Exception{
        List<Customer> customerList = customerRepository.findByName("Hanze");
        assertThat("1234567890".equals(customerList.get(0).getPhone()));
    }
}
