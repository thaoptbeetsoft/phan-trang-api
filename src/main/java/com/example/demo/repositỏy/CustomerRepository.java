package com.example.demo.repositỏy;

import com.example.demo.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends PagingAndSortingRepository<Customer,Long> {
}
