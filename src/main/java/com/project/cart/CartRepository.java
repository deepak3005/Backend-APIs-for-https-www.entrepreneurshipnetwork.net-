package com.project.cart;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.courses.Course;

public interface CartRepository extends JpaRepository<Cart, Integer> 
{

	void save(Course course);

}
