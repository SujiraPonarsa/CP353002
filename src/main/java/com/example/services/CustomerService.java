package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Customer;

@Service
public class CustomerService {
	public Customer getCustomerById(Long id) {
		return new Customer(id, "Lisa");
	}
	public Customer getCustomerByIdName(Long id, String name) {
		return new Customer(id,name);
	}
	public List<Customer> getCustomerList(){
		List<Customer> customers = new ArrayList<>();
		customers.add(getCustomerByIdName(Long.valueOf(1),"Anna"));
		customers.add(getCustomerByIdName(Long.valueOf(2),"Giant"));
		customers.add(getCustomerByIdName(Long.valueOf(3),"Sira"));
		customers.add(getCustomerByIdName(Long.valueOf(4),"Nobita"));
		return customers;
	}

}
