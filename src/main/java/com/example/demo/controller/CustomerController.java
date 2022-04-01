package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cus")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{a}/hello/{b}")
    public List<Customer> findAll(@PathVariable int a, @PathVariable int b){
        List<Customer> customers= customerService.findAll(a,b);
        return customers;
    }
    @PostMapping
    public Customer save(@RequestBody Customer customer){
        Customer customers = customerService.save(customer);
        return customers;
    }
}
