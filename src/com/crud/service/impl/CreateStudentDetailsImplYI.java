package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crud.model.Student;
import com.crud.service.CreateStudentDetails;
import com.crud.utility.ConnectionProvider;

public class CreateStudentDetailsImplYI implements CreateStudentDetails{
	Connection connection=ConnectionProvider.getConnection(); 
	@Override
	public boolean addStudent(Student student) {
		String sql="INSERT INTO student(firstName,lastName,rollNo,age,gender,city,state)values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			
			ps.setString(1,student.getFirstName()); 
			ps.setString(2,student.getLastName()); 
			ps.setInt(3,student.getRollNo()); 
			ps.setInt(4,student.getAge()); 
			ps.setString(5,student.getGender()); 
			ps.setString(6,student.getCity()); 
			ps.setString(7,student.getState());
			
			int  b=ps.executeUpdate(); 
			if(b>0) { 
				System.out.println("Created successfully");
			}
		
			}
		 catch (SQLException e) {
			System.out.println("Adding student exception"+e.getMessage());
		}finally { 
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
}

	@Override
	public boolean addStudentByRequiredDetails(int rollNo, String firstName, String lastName) {
		String sql="INSERT INTO student(firstName,lastName,rollNo)values(?,?,?)";
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,firstName);
			ps.setString(2,lastName); 
			ps.setInt(3,rollNo); 
			
			
			int  b=ps.executeUpdate();
			if(b>0) { 
				System.out.println("Created successfully");
			}
		
			}
		 catch (SQLException e) {
			 System.out.println("Adding student exception"+e.getMessage());
		}finally { 
			try {
				connection.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		return false;
	}

	} 
	
