package com.api.education.University.service;

import java.util.List;

import com.api.education.University.dto.StudentsFormDTO;
import com.api.education.University.entity.Students;

public interface StudentService {
	List<Students> getAllStudents();
	Students getStudentByRollNumber(String rollNumber);
	Students addStudentsData(StudentsFormDTO requestData);
	Students updateStudentsData(String rollNumber);
	void deleteStudentsData(String rollNumber);
}
