package com.api.education.University.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.education.University.entity.Students;

@Repository
public interface StudentsDAO extends JpaRepository <Students, Long>{
	
	List<Students> findAll();
	Students findByRollNumber(String rollNumber);
}
