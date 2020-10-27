package com.crud.service;

import com.crud.model.Student;

public interface UpdateStudentDetails {

	public boolean updateStudentDetails(Student student);
	
	public boolean updateStudentById(int id, Student student);
	
	public boolean updateStudentByRollNumber(int rollNo, Student student);
	
}
