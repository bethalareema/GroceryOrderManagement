package com.reema.groceryordermanagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reema.groceryordermanagement.modal.Customer;
import com.reema.groceryordermanagement.repo.CustomerRepo;

@Service
public class CustomerServiceIml implements CustomerService {

	@Autowired
	CustomerRepo CustomerRepo;
	
	@Override
	public Customer createCustomer(Customer s) {
		return CustomerRepo.save(s);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return CustomerRepo.findAll();
	}

	@Override
	public Customer getCustomerByID(Integer Id) {
		
		return CustomerRepo.findById(Id).get();
	}

	@Override
	public void getdeleteCustmoerById(Integer sid) {
		
		
	}

	@Override
	public Customer getCustomerByName(String name) {
		
		return CustomerRepo.findByCustomerName(name);
	}

	@Override
	public Customer updateCustomer(Integer id,Customer s) {
			System.out.println(id+"/n"+s);
		 Customer updateCustomerData =CustomerRepo.findById(id).get();
		
		 updateCustomerData.setAddress(updateCustomerData.getAddress());
		 updateCustomerData.setCity(updateCustomerData.getCity());
		 updateCustomerData.setCustomerId(updateCustomerData.getCustomerId());
		 updateCustomerData.setState(updateCustomerData.getState());
		
		return CustomerRepo.save(updateCustomerData);
	}

	


	


	
	
	
	
}