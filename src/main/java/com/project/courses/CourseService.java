package com.project.courses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepo;
	
	public List<Course> getAllCourses()
	{
		return courseRepo.findAll();
	}
	
	public Optional<Course> getCourse(int courseId)
	{
		return courseRepo.findById(courseId);
	}
	
	public String saveCourse(Course course)
	{
		courseRepo.save(course);
		return "Course saved with id "+course.getCourseId();
	}
	
	public List<Course> removeCourse(int courseId)
	{
		courseRepo.deleteById(courseId);
		return courseRepo.findAll();
	}
}
