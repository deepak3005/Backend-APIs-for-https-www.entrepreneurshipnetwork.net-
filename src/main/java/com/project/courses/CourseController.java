package com.project.courses;

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
@RequestMapping("/course")
@Api(value = "Course Service", description = "Courses")
public class CourseController 
{
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/searchAllCourses")
	@ApiOperation(value = "API to Search all Courses")
	public List<Course> getAllCourses() 
	{
		return courseService.getAllCourses();
	}
	
	@GetMapping("/searchCourse/{courseId}")
	@ApiOperation(value = "API to Search Course with Id")
	public Optional<Course> getCourse(@PathVariable int courseId) 
	{
		return courseService.getCourse(courseId);
	}
	
	@PostMapping("/save")
	@ApiOperation(value = "API to Add New Course")
	public String saveCourse(@RequestBody Course course) 
	{
		return courseService.saveCourse(course);
	}

	@PostMapping("/update")
	@ApiOperation(value = "API to Update a Course")
	public String updateCourse(@RequestBody Course course) 
	{
		return courseService.saveCourse(course);
	}

	@DeleteMapping("/deleteCourse/{courseId}")
	@ApiOperation(value = "API to Delete a Course")
	public List<Course> deleteCourse(@PathVariable int courseId) 
	{
		return courseService.removeCourse(courseId);

	}
}
