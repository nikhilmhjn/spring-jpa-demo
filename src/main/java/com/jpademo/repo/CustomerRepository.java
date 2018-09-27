package com.jpademo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpademo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastName(String Id);
}