package com.techlabs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	Session session;

	public void putData(Student student) {
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

	public List<Student> getData() {
		List<Student> students = new ArrayList<>();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Student");
		students = query.list();
		session.close();
		return students;
	}
	
	public void update(String add,int id) {
		session=sessionFactory.openSession();
		Student student=(Student) session.get(Student.class, id);
		student.setAddress(add);
		session.update(student);
		session.beginTransaction().commit();
		session.close();
	}
	
	public void delete(int id) {
		session=sessionFactory.openSession();
		Student student=(Student) session.get(Student.class, id);
		session.delete(student);
		session.beginTransaction().commit();
		session.close();
	}
}
