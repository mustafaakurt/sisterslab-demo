package com.mustafaakurt.sisterslabdemo.controller;

import com.mustafaakurt.sisterslabdemo.model.Customer;
import com.mustafaakurt.sisterslabdemo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping()
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") long id) {
        return customerService.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public String updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable("id") long id) {
        customerService.deleteCustomerById(id);
    }



}
