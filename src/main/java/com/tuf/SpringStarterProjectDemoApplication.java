package com.tuf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tuf.entity.Employee;
import com.tuf.service.IEmployeeManagementService;

@SpringBootApplication
public class SpringStarterProjectDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterProjectDemoApplication.class, args);		
	}

}
