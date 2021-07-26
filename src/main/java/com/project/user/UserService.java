package com.project.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.courses.Course;
import com.project.courses.CourseRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers()
	{
		return userRepo.findAll();
	}
	
	public String addUser(User user)
	{
		userRepo.save(user);
		return "User added with id "+user.getUserId();
	}
	
	public List<User> removeUser(int userId)
	{
		userRepo.deleteById(userId);
		return userRepo.findAll();
	}
}
