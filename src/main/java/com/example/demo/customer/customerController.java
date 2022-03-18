package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class customerController {

    @Autowired
    private  customerService customerservice;

    @GetMapping(value = "/allCustomer")
    public List<Customer> getAllCustomer(){
       return customerservice.getAllCustomer();
    }

    @PostMapping("/Create")
    public void addCustomer(@RequestBody Customer c){
        String name = c.getName().toUpperCase();
        c.setName(name);
        customerservice.addCustomer(c);
    }

    @GetMapping("/Customer/{id}")
    public Optional<Customer> getCuster(@PathVariable Long id){
        return  customerservice.getCustomer(id);
    }

    @RequestMapping(value = "/editCustomer/{id}",method = {RequestMethod.PUT,RequestMethod.GET})
    public  void  edit(@RequestBody Customer c,@PathVariable Long id){
        customerservice.updateCustomer(c,id);
    }

    @DeleteMapping(value = "/delCustomer/{id}")
    public void  deleteCustomer(@PathVariable Long id){
        customerservice.delCustomer(id);
    }
}
