package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.crud.model.Student;
import com.crud.service.CreateStudentDetails;
import com.crud.utility.ConnectionProvider;

public class CreateStudentDetailsImpl implements CreateStudentDetails {

	@Override
	public boolean addStudent(Student student) {
		int result = 0;
		Connection con = ConnectionProvider.getConnection();
		String sql = "INSERT INTO STUDENT(firstName,lastName,rollNo,age,gender,city,state) VALUES(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, student.getFirstName());
			ps.setString(2, student.getLastName());
			ps.setInt(3, student.getRollNo());
			ps.setInt(4, student.getAge());
			ps.setString(5, student.getGender());
			ps.setString(6, student.getCity());
			ps.setString(7, student.getState());
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Adding student exception " + e.getMessage());
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of Connection close " + e.getMessage());
				}
			}
		} 

		return (result > 0) ? true : false;
	}

	@Override
	public boolean addStudentByRequiredDetails(int rollNo, String firstName, String lastName) {
		// TODO Auto-generated method stub
		return false;
	}

}
