package com.rest_api.service;

import java.util.List;

import com.rest_api.model.Student;

public interface StdService {
	
	public Student createStudent(Student student);

	public List<Student> getAllStudent();


}
