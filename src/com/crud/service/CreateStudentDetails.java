package com.crud.service;

import com.crud.model.Student;

public interface CreateStudentDetails {
	
	public boolean addStudent(Student student);
	
	public boolean addStudentByRequiredDetails(int rollNo, String firstName, String lastName);

}
