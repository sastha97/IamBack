package com.pojo;

import java.util.List;

public class TestFindEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> emp = dao.findAllEmployees();
		for(Employee employee:emp) {
			System.out.println(employee.getName()+"::"+employee.getEmpId()+"::"+employee.getSalary());
		}

	}

}
