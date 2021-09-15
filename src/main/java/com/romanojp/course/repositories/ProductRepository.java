package com.romanojp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romanojp.course.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
 
}
