package com.crud.service;

import com.crud.model.Student;

public interface DeleteStudentDetails {
	
	public boolean deleteStudentById(int id);
	
	public boolean deleteStudentByRollNumber(int rollNo);
	
	public boolean deleteStudentByName(String firstName, String lastName);
	
	public boolean deleteStudentByCity(String city);
	
	public boolean deleteStudentByState(String state);
	
	public boolean deleteStudent(Student student);

}
