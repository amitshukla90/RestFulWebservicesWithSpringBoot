package com.springboot.rest.RestWebservices.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.rest.RestWebservices.IDAO.IMyRestServiceDAO;
import com.springboot.rest.RestWebservices.model.Employee;

@Repository
public class MyRestServiceDAOImpl  implements  IMyRestServiceDAO{

    @Autowired
    private SessionFactory sessionFactory;


	@Override
	public Employee createEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
		return employee;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
