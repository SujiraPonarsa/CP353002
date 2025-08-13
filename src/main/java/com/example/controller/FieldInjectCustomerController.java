package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.services.CustomerService;

@RestController
@RequestMapping("/field")
public class FieldInjectCustomerController {
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/{id}")//Get http://localhost:8080/field/15
	public String getCustomerById(@PathVariable Long id) {
		Customer cust = customerservice.getCustomerById(id);
		return "Field Injection: Id:" +cust.getId() + ", Name:"+cust.getName();
		
	}
	@GetMapping("/{id}/{name}")//Get http://localhost:8080/field/10/Alice
	public String getCustomerByIdName(@PathVariable Long id,@PathVariable String name) {
		Customer cust = customerservice.getCustomerByIdName(id,name);
		return "Field Injection: Id:" +cust.getId() + ", Name:"+cust.getName();
	}
	@GetMapping("/customerlist") // แก้พาธให้ชัดเจน
	public List<Customer> getCustomerList(){
	    return customerservice.getCustomerList();
	
    }
	

}
