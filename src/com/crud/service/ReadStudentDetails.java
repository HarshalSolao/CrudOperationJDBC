package com.crud.service;

import java.util.Set;

import com.crud.model.Student;

public interface ReadStudentDetails {

	public Set<Student> getAllStudents();
	
	public Set<Student> getAllStudentByLastName(String lastName);
	
	public Student getStudentById(int id);
	
	public Student getStudentByRollNumber(int rollNo);
	
	public Set<Student> getStudentByGender(String gender);
	
	public Set<Student> getStudentByCity(String city);
	
	public Set<Student> getStudentByState(String state);
	
	public Set<Student> getStudentByGivenInfo(Student student);
	
	
}
