package com.example.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.rest.exception.CustomerNotFoundException;
import com.example.rest.exception.CustomerResponseEntity;
import com.example.service.CustomerService;


@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	// add mapping for GET /customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		
		return customerService.getCustomers();
		
	}
		
	@GetMapping("/customers/{customerId}")
	public Customer getStudent(@PathVariable int customerId) throws CustomerNotFoundException {

		Customer customer = customerService.getCustomer(customerId);
		if ( customer==null ) {			
			throw new CustomerNotFoundException("Customer id not found - " + customerId);
		}
		
		return customer;
	}

	@ExceptionHandler
	public ResponseEntity<CustomerResponseEntity> handleException(CustomerNotFoundException snfe)
	{
		return new ResponseEntity<CustomerResponseEntity>(new CustomerResponseEntity(HttpStatus.NOT_FOUND.value(),
				snfe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
	}
	
}
