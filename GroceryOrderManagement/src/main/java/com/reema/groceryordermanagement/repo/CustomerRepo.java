package com.reema.groceryordermanagement.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reema.groceryordermanagement.modal.Customer;


@Repository
public interface CustomerRepo  extends JpaRepository<Customer,Integer>{

	



//       Customer findByName(String name);

       Customer findByCustomerName(String customerName);

	
	

}
