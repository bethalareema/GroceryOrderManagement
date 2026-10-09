package com.reema.groceryordermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reema.groceryordermanagement.modal.Customer;
import com.reema.groceryordermanagement.service.CustomerService;


//http://localhost:3306/Customer
@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	
	@Autowired
	CustomerService custmoerService;
	
	
//	http://localhost:3355/Customer/customerall
	@GetMapping("/customerall")
	List<Customer> getAllCustomer(){
	
		return custmoerService.getAllCustomer();	
	}
	
//	http://localhost:3355/Customer/getid/2
	@GetMapping("/getid/{Id}")
	Customer getCustomerById(@PathVariable Integer Id) {
		return custmoerService.getCustomerByID(Id);
	}
	
//	http://localhost:3355/Customer/getname/Reema
	@GetMapping("/getname/{name}")
	Customer getCustomerByNmae(@PathVariable String name) {
		return custmoerService.getCustomerByName(name);
	}
	
//	http://localhost:3355/Customer/customercreate
	@PostMapping("/customercreate")
	Customer createCustomer(@RequestBody Customer s) {
		return custmoerService.createCustomer(s);
	}
	
//	http://localhost:3355/Customer/update/2
	@PutMapping("/update/{id}")
	public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
		System.out.print("update request");
	    return custmoerService.updateCustomer(id, customer);
	}
	
//	http://localhost:3355/Customer/delete/2
	@DeleteMapping("/delete/{id}")
	 String getdeleteCustmoer(@PathVariable Integer id ) {
		
		return "Delete Complteted" +id;
		
	}
	
	
}

