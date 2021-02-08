package com.example.employee.Employee_Service.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
import com.example.employee.Employee_Service.entity.Employee;
import com.example.employee.Employee_Service.repository.EmployeeRepository;
	

	@Controller
		public class EmployeeController {

		 
		 @Autowired
		 private EmployeeRepository userRepo;

		 
		 @GetMapping(path = "/employee")
		 public String getEmployeePage() {
		  return "home";
		 }
		
		 @PostMapping(path="/employee")
		 public String submitData(Employee signupForm) {
		  //check whether the form data is coming or not\
		  Employee  employee = new Employee();
		 if(null != signupForm) {
		   employee = new Employee(signupForm.getForename(), signupForm.getSurname(), signupForm.getCompany(), signupForm.getPostcode(), signupForm.getAge());
		  }
		
		 userRepo.save(employee);
		  return "employee-data";
		 }
		 
		
	}
