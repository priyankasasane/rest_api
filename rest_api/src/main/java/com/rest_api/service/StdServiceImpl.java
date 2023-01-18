package com.rest_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest_api.dao.StdDao;
import com.rest_api.model.Student;

@Service
public class StdServiceImpl implements StdService {

	@Autowired
	StdDao dao;
	
	@Override
	public Student createStudent(Student student) {
		return dao.createStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return dao.getAllStudent();
	}

}
