package com.springboot.rest.RestWebservices.serviceImpl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.RestWebservices.IDAO.IMyRestServiceDAO;
import com.springboot.rest.RestWebservices.Iservice.IMyRestService;
import com.springboot.rest.RestWebservices.model.Employee;

@Service
@Transactional
public class MyServiceImpl implements IMyRestService {
	
	 
	@Autowired
	IMyRestServiceDAO iMyRestServiceDAO;
	
	public static final Logger log = LoggerFactory.getLogger(MyServiceImpl.class);
	
	 @Override
	public String sayHello() throws Exception {
		log.info("[MyServiceImpl]  sayHello method sayHello performing");
		return "Hi this is Spring Boot Application";
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return iMyRestServiceDAO.createEmployee(employee);
	}

}
