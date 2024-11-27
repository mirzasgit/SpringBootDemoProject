package com.tuf.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.tuf.entity.Employee;

import jakarta.transaction.Transactional;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	
	 
/*	Key Components:
@Modifying: Indicates that this query modifies the database (not a SELECT query).
@Transactional: Ensures that the update is wrapped in a transaction i.e commits/saves-changes after executing.
@Query: The custom JPQL query that updates the employee record. 
Note that we use the Employee entity name and field names, not the table or column names in JPQL Query.
*/
	@Query("update Employee set employeeName=:empName, employeeSalary=:empSal where employeeId=:empId")
	@Modifying
	@Transactional
	public int updateEmp(int empId, String empName, double empSal);
	
	

}
	 

