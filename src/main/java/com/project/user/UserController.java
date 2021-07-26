package com.project.user;

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
@RequestMapping("/user")
@Api(value = "User Service", description = "User")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/viewUsers")
	@ApiOperation(value = "API to View Users")
	public List<User> getAllUsers() 
	{
		return userService.getAllUsers();
	}
	
	@PostMapping("/addUser")
	@ApiOperation(value = "API to Add New User")
	public String addUser(@RequestBody User user) 
	{
		return userService.addUser(user);
	}
	
	@PostMapping("/updateUser")
	@ApiOperation(value = "API to Update User")
	public String updateUser(@RequestBody User user) 
	{
		return userService.addUser(user);
	}

	@DeleteMapping("/removeUser/{userId}")
	@ApiOperation(value = "API to Remove a User")
	public List<User> deleteUser(@PathVariable int userId) 
	{
		return userService.removeUser(userId);

	}
}
