package com.reema.groceryordermanagement.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer12")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customerId;
	private String customerName;
	private String email;
	private Integer phone;
	
	 private String address;
	 private String city;
	 private String state;
	 
	 
	 
	 public Integer getCustomerId() {
		 return customerId;
	 }
	 public void setCustomerId(Integer customerId) {
		 this.customerId = customerId;
	 }
	 public String getCustomerName() {
		 return customerName;
	 }
	 public void setCustomerName(String customerName) {
		 this.customerName = customerName;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public Integer getPhone() {
		 return phone;
	 }
	 public void setPhone(Integer phone) {
		 this.phone = phone;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 public String getState() {
		 return state;
	 }
	 public void setState(String state) {
		 this.state = state;
	 }
	 
	
	 

	 
	 
}
