package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class customerService {

    @Autowired
    private  customerRepository customerrepository;
    public List<Customer> getAllCustomer() {
       return customerrepository.findAll();
    }

    public void addCustomer(Customer c) {
        customerrepository.save(c);
    }

    public Optional<Customer> getCustomer(Long id) {
       return customerrepository.findById(id);
    }


    public void updateCustomer(Customer c, Long id) {
        customerrepository.save(c);
    }

    public void delCustomer(Long id) {
        customerrepository.deleteById(id);
    }
}
