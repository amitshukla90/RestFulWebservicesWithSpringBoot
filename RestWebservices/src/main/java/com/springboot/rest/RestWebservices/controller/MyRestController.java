package com.springboot.rest.RestWebservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.RestWebservices.Iservice.IMyRestService;
import com.springboot.rest.RestWebservices.model.Employee;

@RestController
@RequestMapping(value ="/login")
public class MyRestController {
 public static final Logger log = LoggerFactory.getLogger(MyRestController.class);
	 @Autowired
	 IMyRestService iMyRestService;
	
	@GetMapping("/hello")
	public String sayHello() throws Exception{
		log.info("[MyRestController]  sayHello method sayHello performing");
		return iMyRestService.sayHello();
	}
	
	@PostMapping(value="/create",headers="Accept=application/json")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) throws Exception {
		log.info("[MyRestController]  createEmployee method createEmployee performing");
		Employee empResponse = iMyRestService.createEmployee(employee);
		if (empResponse != null) {
			return new ResponseEntity<Employee>(empResponse, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Employee>(empResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}



}
