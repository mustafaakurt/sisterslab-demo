package com.mustafaakurt.sisterslabdemo.controller;

import com.mustafaakurt.sisterslabdemo.model.Customer;
import com.mustafaakurt.sisterslabdemo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    // create addCustomer using post mapping and request body
    @PostMapping()
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
