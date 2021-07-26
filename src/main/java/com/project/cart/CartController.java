package com.project.cart;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cart")
@Api(value = "Cart Service", description = "Cart")
public class CartController 
{
	@Autowired
	private CartService cartService;
	
	@GetMapping("/viewCart")
	@ApiOperation(value = "API to View Cart")
	public List<Cart> getAllItems() 
	{
		return cartService.getAllItems();
	}
	
	@PostMapping("/add")
	@ApiOperation(value = "API to Add Course To Cart")
	public String addCourseToCart(@RequestBody int courseId) 
	{
		return cartService.addCourseToCart(courseId);
	}

	@DeleteMapping("/removeCourseFromCart/{courseId}")
	@ApiOperation(value = "API to Remove a Course from Cart")
	public List<Cart> deleteCart(@PathVariable int courseId) 
	{
		return cartService.removeCourse(courseId);

	}
}
