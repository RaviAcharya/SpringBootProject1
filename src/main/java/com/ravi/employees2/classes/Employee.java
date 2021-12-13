package com.ravi.employees2.classes;


import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class Employee {
	@Id
	private String employeeId;
	private  String name;
	private  int age;
	private  String emailId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateOfJoining;
	public Employee() {
		super();

	}

	public Employee(String employeeId, String name, int age, String emailId,Date dateOfJoining) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.dateOfJoining=dateOfJoining;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmailId() {
		return emailId;
	}
	public Date getDate(){
		return dateOfJoining;
	}

	@Override
	public int hashCode() {
		return (""+age+name+emailId+employeeId).hashCode();
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee)
		{
			Employee employee = (Employee)obj;
			if(this.name.equals(employee.name) && this.employeeId.equals(employee.employeeId) && this.emailId.equals(employee.emailId) && this.age==employee.age)
			{
				return true;
			}
		}
		return false;
	}
	

}
