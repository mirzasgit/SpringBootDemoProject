
package com.tuf.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tuf.entity.Employee;
import com.tuf.service.IEmployeeManagementService;

@Component
public class DemoRunnerTest implements CommandLineRunner {

	@Autowired
	private IEmployeeManagementService service;

	@Override
	public void run(String... args) throws Exception {

		try {

			String registerEmployee = service.registerEmployee(new Employee(3, "harry", 123d));
			System.out.println(registerEmployee);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
