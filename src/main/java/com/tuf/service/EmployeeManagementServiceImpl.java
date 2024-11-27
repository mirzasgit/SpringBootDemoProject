package com.tuf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuf.entity.Employee;
import com.tuf.repository.IEmployeeRepository;

@Service("employeeService")
public class EmployeeManagementServiceImpl implements IEmployeeManagementService {

	@Autowired
	private IEmployeeRepository employeeRepo;

	@Override
	public String registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee savedEmployee = employeeRepo.save(employee);
		return savedEmployee == null ? "employee not saved"
				: "employee saved successfully with id " + savedEmployee.getEmployeeId();

	}

	@Override
	public void deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(empId);

	}

	@Override
	public void getEmployee(int empId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String updateEmployee(int empId, String empName, double empSal) {

		int updateEmployeeById = employeeRepo.updateEmp(empId, empName, empSal);
		if (updateEmployeeById > 0) {
			return "Employee updated successfully";
		} else {
			return "Employee not found";
		}

	}

}
