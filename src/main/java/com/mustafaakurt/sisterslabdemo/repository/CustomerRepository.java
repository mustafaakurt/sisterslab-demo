package com.mustafaakurt.sisterslabdemo.repository;

import com.mustafaakurt.sisterslabdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
