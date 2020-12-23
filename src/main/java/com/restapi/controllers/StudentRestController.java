package com.restapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class StudentRestController {
	
	@RequestMapping(value="/getStudents",method=RequestMethod.GET)
	public String getStudentProcess() {
		return "hello world";
	}
	
	@RequestMapping(value="/saveStudent",method=RequestMethod.GET)
	public String saveStudentProcess() {
		return "hey boy";
	}
}
