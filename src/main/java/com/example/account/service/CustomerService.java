package com.example.account.service;

import com.example.account.exception.CustomerNotFoundE;
import com.example.account.model.Customer;
import com.example.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id){
        return customerRepository.findById(id).orElseThrow(
                ()->new CustomerNotFoundE("customer not found "+id));
    }
}
