package com.crud.controller;

import java.util.Set;

import com.crud.model.Student;
import com.crud.service.CreateStudentDetails;
import com.crud.service.DeleteStudentDetails;
import com.crud.service.ReadStudentDetails;
import com.crud.service.UpdateStudentDetails;
import com.crud.service.impl.CreateStudentDetailsImpl;
import com.crud.service.impl.ReadStudentDetailsImpl;

public class StudentController {
	

	
	UpdateStudentDetails updateStudents;
	DeleteStudentDetails deleteStudents;
	
	public static void main(String[] arg) {
		CreateStudentDetails createStudents = new CreateStudentDetailsImpl();
		ReadStudentDetails readStudents = new ReadStudentDetailsImpl();
		Student student = new Student();
		student.setGender("Male");
		/*
		 * student.setLastName("Spring"); student.setAge(25); student.setRollNo(2000);
		 * student.setCity("Pune"); student.setState("MH"); student.setGender("Other");
		 */
		
		/*
		 * boolean flag = createStudents.addStudent(student); if(flag) {
		 * System.out.println("Student added sucessfully !"); } else {
		 * System.out.println("Student not added !"); }
		 */
		
		
		Set<Student> students = readStudents.getStudentByGivenInfo(student);
		
		for (Student student2 : students) {
			System.out.println(student2);
		}
		
		
	}
	

}
