package com.jpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpademo.model.Customer;
import com.jpademo.repo.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/save/{firstName}/{lastName}")
	public void saveData(@PathVariable("firstName") String firstName , @PathVariable("lastName") String lastName) {
		
		Customer cutomer = new Customer(firstName, lastName);
		customerRepository.save(cutomer);
		
	}
	
	@GetMapping("/cusomerSearch/{lastName}")
	public void cusomerSearch(@PathVariable("lastName") String lastName) {
		
		List<Customer> customers =  customerRepository.findByLastName(lastName);
		System.out.println(customers.stream().findFirst().toString());
		
	}

}
