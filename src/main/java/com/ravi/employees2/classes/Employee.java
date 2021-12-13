package com.ravi.employees2.classes;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation="employee")
public class Employee {
	@Id
	private String employeeId;
	private  String name;
	private  int age;
	private  String emailId;
	
	public Employee() {
		super();
	
	}

	public Employee(String employeeId, String name, int age, String emailId) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
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
