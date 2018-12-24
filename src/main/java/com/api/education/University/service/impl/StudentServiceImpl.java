package com.api.education.University.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.education.University.dao.StudentsDAO;
import com.api.education.University.service.StudentService;
import com.api.education.University.entity.Students;

@Service
public class StudentServiceImpl implements StudentService{

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
	public Students addStudentsData(Students requestData) {
		return studentsDao.save(requestData);
	}
}
