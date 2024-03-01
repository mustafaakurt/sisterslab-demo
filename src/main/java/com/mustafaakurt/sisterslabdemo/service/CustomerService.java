package com.mustafaakurt.sisterslabdemo.service;

import com.mustafaakurt.sisterslabdemo.model.Customer;
import com.mustafaakurt.sisterslabdemo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        }else {
            log.info("Customer not found with id: " + id);
            return null;
        }
    }

    public String updateCustomer(long id, Customer customer) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer oldCustomer = optionalCustomer.get();
            oldCustomer.setFirstName(customer.getFirstName());
            customerRepository.save(oldCustomer);
            return "Customer updated successfully";
        }else {
            log.info("Customer not found with id: " + id);
            return "Customer not found with id: " + id;
        }
    }

    public void deleteCustomerById(long id) {
        customerRepository.deleteById(id);
    }
}
