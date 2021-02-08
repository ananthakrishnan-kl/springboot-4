package com.example.employee.Employee_Service.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Employee {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 private String forename;
	 private String surname;
	 private String company;
	 private String age;
	 private String postcode;

	 public Employee() {
	  super();
	  
	 }

	 public Employee(String forename, String surname, String company, String age,String postcode) {
	  super();
	  this.forename = forename;
	  this.surname = surname;
	  this.company = company;
	  this.age = age;
	  this.postcode=postcode;
	 }

	 public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getForename() {
	  return forename;
	 }

	 public void setForename(String firstName) {
	  this.forename = firstName;
	 }

	 public String getSurname() {
	  return surname;
	 }

	 public void setSurname(String surname) {
	  this.surname = surname;
	 }

	 public String getCompany() {
	  return company;
	 }

	 public void setCompany(String company) {
	  this.company = company;
	 }

	 public String getAge() {
	  return age;
	 }

	 public void setAge(String age) {
	  this.age = age;
	 }

	}



