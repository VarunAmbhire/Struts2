package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action {

	@Autowired
	private StudentService studentService;

	private List<Student> students=new ArrayList<>();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
//		Student stud=new Student(101, "Varun", "Dahanu");
//		Student stud1=new Student(102, "Marine", "US");
//		Student stud2=new Student(103, "Seal", "Afgan");
//		
//		studentService.putData(stud);
//		studentService.putData(stud1);
//		studentService.putData(stud2);
		
//		studentService.delete(103);
		
		studentService.update("Virginia", 102);
		
		students = studentService.getData();
		return Action.SUCCESS;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
