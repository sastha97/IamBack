package com.pojo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEmployeeDAO1 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddEmployee() {
		EmployeeDAO dao = new EmployeeDAO();
		
		Employee emp = new Employee(1002,6000,"BACD");
		
		int rows = dao.addEmployee(emp);
		assertEquals(1, rows);
	}
	
	@Test
	void testAddEmployee_Negative() {
		EmployeeDAO dao = new EmployeeDAO();
		
		Employee emp = new Employee(1002,6000,"BACD");
		
		int rows = dao.addEmployee(emp);
		assertEquals(0, rows);
		assertTrue(rows==0);
	}
	

}
