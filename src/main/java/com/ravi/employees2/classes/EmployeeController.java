package com.ravi.employees2.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
		
		@Autowired
		public EmployeeService employeeService;
		
		@RequestMapping("/allemployees")
		public List<Employee> getAllEmployees(){
		      return employeeService.getAllEmployee();
		}
	    
		@RequestMapping("/employee/id/{id}")
		public Employee getEmployee(@PathVariable String id) {
			return employeeService.getEmployee(id);
		}
		
		@RequestMapping(method=RequestMethod.POST, value="/addemployee")
		public void addEmployee(@RequestBody Employee employee) {
			employeeService.addEmployee(employee);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/updateemployee/id/{id}")
		public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
			employeeService.updateEmployee(employee, id);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value ="/deleteemployee/id/{id}")
		public void deleteEmployee(@PathVariable String id) {
			employeeService.deleteEmployee(id);
		}

}
