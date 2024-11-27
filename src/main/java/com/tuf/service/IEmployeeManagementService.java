package com.tuf.service;

import com.tuf.entity.Employee;

public interface IEmployeeManagementService {  

	public String registerEmployee(Employee employee);
	
	public void deleteEmployeeById(int empId);
	
	public String updateEmployee(int empId,String empName, double salary);
	
	public void getEmployee(int empId);
	
}
