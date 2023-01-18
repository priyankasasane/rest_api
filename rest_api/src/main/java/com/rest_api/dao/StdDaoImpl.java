package com.rest_api.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest_api.model.Student;

@Repository
public class StdDaoImpl implements StdDao {
	
	@Autowired
	SessionFactory factory;

	@Override
	public Student createStudent(Student student) {

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(student);
		
		tx.commit();
		
		return student;
	}

}
