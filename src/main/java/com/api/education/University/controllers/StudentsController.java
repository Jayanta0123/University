package com.api.education.University.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.education.University.entity.Students;
import com.api.education.University.service.StudentService;

@RequestMapping("/api")
@RestController
public class StudentsController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/allStudents")
	public List<Students> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/student")
	public Students getStudentByRollNumber(@RequestParam String rollNumber){
		return studentService.getStudentByRollNumber(rollNumber);
	}
	
	@PostMapping("/student")
	public Students addStudentsData(@RequestBody Students requestData ) {
		return studentService.addStudentsData(requestData);
	}
}
