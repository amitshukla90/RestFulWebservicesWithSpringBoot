package com.springboot.rest.RestWebservices.IDAO;

import com.springboot.rest.RestWebservices.model.Employee;

public interface IMyRestServiceDAO {
	
	public Employee saveEmployee(Employee employee);

	public Employee createEmployee(Employee employee);

}
