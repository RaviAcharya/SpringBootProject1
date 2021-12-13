package com.ravi.employees2.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
@Autowired
private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		
		List<Employee> employeeList = new ArrayList<Employee>();
		long count = employeeRepository.count();
	    for(int i=0;i<count;i++){
			employeeList.add(employeeRepository.findAll().get(i));
		}
		return employeeList;
	}
	
	public Employee getEmployee(String id) {
		return employeeRepository.findById(id).get();
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(Employee employee, String id) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String id) {
	    employeeRepository.deleteById(id);
	}
}
