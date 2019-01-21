package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.dao.StudentDao;
import com.techlabs.entity.Student;


@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	
	public void putData(Student student) {
		studentDao.putData(student);
	}

	public List<Student>getData(){
		return studentDao.getData();
	}
	
	public void update(String add,int id) {
		studentDao.update(add, id);
	}
	public void delete(int id) {
		studentDao.delete(id);
	}
}
