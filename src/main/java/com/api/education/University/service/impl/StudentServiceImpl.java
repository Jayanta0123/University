package com.api.education.University.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.education.University.dao.StudentsDAO;
import com.api.education.University.dto.StudentsFormDTO;
import com.api.education.University.service.StudentService;
import com.api.education.University.entity.Students;

@Service
public class StudentServiceImpl implements StudentService{

	Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

	@Autowired
	private StudentsDAO studentsDao;
	
	@Override
	public List<Students> getAllStudents() {
		return studentsDao.findAll();
	}

	@Override
	public Students getStudentByRollNumber(String rollNumber) {
		return studentsDao.findByRollNumber(rollNumber);
	}

	@Override
	@Transactional
	public Students addStudentsData(StudentsFormDTO requestData) {
		Students student = new Students(requestData);
		return studentsDao.save(student);
	}

	@Override
	public Students updateStudentsData(String rollNumber) {
		Students currStudent = studentsDao.findByRollNumber(rollNumber);
		return currStudent;
	}

	@Override
	@Transactional
	public void deleteStudentsData(String rollNumber) {
		Students student = studentsDao.findByRollNumber(rollNumber);
		studentsDao.delete(student);
	}
}
