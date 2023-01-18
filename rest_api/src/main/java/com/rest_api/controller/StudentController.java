package com.rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest_api.model.Student;
import com.rest_api.service.StdService;

@RestController
public class StudentController {

	@Autowired
	StdService service;
	
	
//	@PostMapping("/students")
	
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public String createStudent(@RequestBody Student student) {
		
		service.createStudent(student);
		
		return "successfull";
		
	}
	
	
	@GetMapping("/students")
	public  List<Student> getAllStudent(){
		
//		List<Student> student=;
		return service.getAllStudent();
	}
	
}
