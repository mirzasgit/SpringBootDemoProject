package com.tuf.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee_info")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

	@Id
	@Column(name="empId")
	@GeneratedValue
	private Integer employeeId;
	
	@Column(name="empName", length=20)
	@NonNull
	private String employeeName;
	
	@Column(name="empSal")
	@NonNull
	private Double employeeSalary;	
	
}
