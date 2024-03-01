package com.mustafaakurt.sisterslabdemo.service;

import com.mustafaakurt.sisterslabdemo.model.Customer;
import com.mustafaakurt.sisterslabdemo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
