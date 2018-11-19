package com.springboot.rest.RestWebservices.Iservice;

import com.springboot.rest.RestWebservices.model.Employee;

public interface IMyRestService {
	
	public String sayHello() throws Exception;

	public Employee createEmployee(Employee employee);

}
