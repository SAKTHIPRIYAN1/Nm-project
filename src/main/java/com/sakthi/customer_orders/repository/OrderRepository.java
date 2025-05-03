package com.sakthi.customer_orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakthi.customer_orders.model.Order;

/**
 * @author Sakthipriyan V
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
