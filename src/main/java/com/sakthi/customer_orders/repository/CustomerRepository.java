package com.sakthi.customer_orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakthi.customer_orders.model.Customer;

/**
 * @author Sakthipriyan V
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
