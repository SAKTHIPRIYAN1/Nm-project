package com.sakthi.customer_orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sakthi.customer_orders.model.User;

import java.util.Optional;

/**
 * @author Sakthipriyan V
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
