package com.project.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.courses.Course;

public interface UserRepository extends JpaRepository<User, Integer> 
{

}
