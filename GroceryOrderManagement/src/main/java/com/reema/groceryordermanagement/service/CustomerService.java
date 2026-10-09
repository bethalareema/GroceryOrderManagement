package com.reema.groceryordermanagement.service;

import com.reema.groceryordermanagement.modal.Customer;

import java.util.List;

public interface CustomerService {
	
	
      List<Customer> getAllCustomer();
  	
  	  
      Customer getCustomerByID(Integer id);
  	
      void getdeleteCustmoerById(Integer sid);

  	 Customer getCustomerByName(String name);

  	 Customer updateCustomer(Integer id, Customer s);

	Customer createCustomer(Customer c);


	

	


	
	

	


}
