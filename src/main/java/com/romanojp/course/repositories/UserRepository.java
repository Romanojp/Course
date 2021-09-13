package com.romanojp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romanojp.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
 
}
