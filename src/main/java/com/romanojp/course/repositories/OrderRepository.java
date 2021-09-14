package com.romanojp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romanojp.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
 
}
