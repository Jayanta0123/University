package com.api.education.University.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.education.University.dto.StudentsFormDTO;
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
	public Students addStudentsData(StudentsFormDTO requestData ) {
		return studentService.addStudentsData(requestData);
	}
	
	@PutMapping("/student/update")
	public Students updateStudentsData(@RequestParam String rollNumber) {
		return studentService.updateStudentsData(rollNumber);
	}
	
	@DeleteMapping("/student/delete")
	public void deleteStudent (@RequestParam String rollNumber) {
		studentService.deleteStudentsData(rollNumber);
	}
}
