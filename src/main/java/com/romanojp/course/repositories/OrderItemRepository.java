package com.romanojp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romanojp.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
 
}
