package com.project.cart;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.courses.Course;
import com.project.courses.CourseRepository;

@Service
public class CartService 
{
	@Autowired
	private CartRepository cartRepo;
	
	@Autowired
	private CourseRepository courseRepo;
	
	public List<Cart> getAllItems()
	{
		return cartRepo.findAll();
	}
	
	public String addCourseToCart(int courseId)
	{
		Course course = courseRepo.getById(courseId);
		cartRepo.save(course);
		return "Item added with id "+course.getCourseId();
	}
	
	public List<Cart> removeCourse(int courseId)
	{
		courseRepo.deleteById(courseId);
		return cartRepo.findAll();
	}
}
