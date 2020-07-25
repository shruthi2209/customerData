package com.shruthi.customer.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.shruthi.customer.data.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
