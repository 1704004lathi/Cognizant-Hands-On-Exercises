package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ormLearnApplicationEmp {

    private static final Logger LOGGER = LoggerFactory.getLogger(ormLearnApplicationEmp.class);
    private static EmployeeService employeeService;

    public static void main(String[] args) {
        // Start Spring Boot application
        ApplicationContext context = SpringApplication.run(ormLearnApplicationEmp.class, args);
        LOGGER.info("Inside main");

        // Get EmployeeService bean from context
        employeeService = context.getBean(EmployeeService.class);

        // Call test method
        testAddEmployee();
    }

    private static void testAddEmployee() {
        LOGGER.info("Start");

        Employee employee = new Employee();
        employee.setName("John Doe");

        employeeService.addEmployee(employee);

        LOGGER.debug("Saved Employee: {}", employee);

        LOGGER.info("End");
    }
}