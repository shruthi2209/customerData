package com.shruthi.customer.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shruthi.customer.data.entities.Customer;
import com.shruthi.customer.data.repos.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository customerRepo;
	
	@Test
	public void createCustomerStudent() {
		Customer cust = new Customer();
		cust.setName("John 2");
		cust.setEmail("john.smith@gmail.com");
		customerRepo.save(cust);
	}

	@Test
	public void findByIdCustomer() {
		System.out.println(customerRepo.findById(1l).get());
	}
	
	@Test
	public void udpateCustomer() {
		Customer cust = customerRepo.findById(2l).get();
		cust.setName("John Smith");
		customerRepo.save(cust);
	}
	
	@Test
	public void deleteCustomer() {
		customerRepo.delete(customerRepo.findById(1l).get());
	}
}
