package com.rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest_api.model.Student;
import com.rest_api.service.StdService;

@Controller
public class StudentController {

	@Autowired
	StdService service;
	
	
//	@PostMapping("/students")
	
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public @ResponseBody String createStudent(@RequestBody Student student) {
		
		service.createStudent(student);
		
		return "successfull";
		
	}
	
}
