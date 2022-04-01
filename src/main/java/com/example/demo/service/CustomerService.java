package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repositỏy.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll( int pageNo, int pageSize){
        if (pageNo > 0){
            pageNo = pageNo - 1 ;
        }

        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Customer> pagedResult = customerRepository.findAll( pageable);
        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Customer>();
        }

    }
    public Customer save(Customer customer){
        return   customerRepository.save(customer);

    }
}
