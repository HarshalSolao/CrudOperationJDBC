package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.crud.model.Student;
import com.crud.service.CreateStudentDetails;
import com.crud.utility.ConnectionProvider;

public class CreateStudentDetailsImplJB implements CreateStudentDetails {
	Connection con = ConnectionProvider.getConnection();
	int result = 0;
	String sql = "insert into studentj (firstName,lastName,rollNo,age,gender,city,state)values(?,?,?,?,?,?,?)";

	@Override
	public boolean addStudent(Student student) {
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getFirstName());
			ps.setString(2,student.getLastName());
			ps.setInt(3, student.getRollNo());
			ps.setInt(4, student.getAge());
			ps.setString(5, student.getGender());
			ps.setString(6,student.getCity());
			ps.setString(7, student.getState());
			
			result = ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Adding student exception " + e.getMessage());
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e) {
					System.out.println("Error at the time of Connection close " + e.getMessage());
				}
			}
		}
		
		return (result>0)?true:false;
	}

	@Override
	public boolean addStudentByRequiredDetails(int rollNo, String firstName, String lastName) {

		try {
			Statement stmt = ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getInt(5) + "  " + rs.getString(6) + "  " + rs.getString(7));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e) {
					System.out.println("Error at the time of Connection close " + e.getMessage());
				}
			}
		}
		return false;

	}

}
