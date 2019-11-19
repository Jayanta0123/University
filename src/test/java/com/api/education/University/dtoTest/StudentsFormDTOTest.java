package com.api.education.University.dtoTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.meanbean.test.BeanTester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.api.education.University.dto.StudentsFormDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentsFormDTOTest {
	
	private Logger logger = LoggerFactory.getLogger(StudentsFormDTOTest.class);
	private BeanTester bean;
	
	@Before
	public void setUp() {
		bean = new BeanTester();
	}
	
	@Test
	public void testBean() {
		try {
			bean.testBean(StudentsFormDTO.class);
		}catch (Exception ex) {
			logger.error("Exception occurred in testing the bean :: {}", ex);
		}
	}
}
