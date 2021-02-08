package com.example.employee.Employee_Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.Employee_Service.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}
