package com.rest_api.dao;

import java.util.List;

import com.rest_api.model.Student;

public interface StdDao {

	public Student createStudent(Student student);

	public List<Student> getAllStudent();
}
