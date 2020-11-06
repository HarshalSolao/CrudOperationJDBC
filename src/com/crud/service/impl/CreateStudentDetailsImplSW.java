package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.crud.model.Student;
import com.crud.service.CreateStudentDetails;
import com.crud.utility.ConnectionProvider;

public class CreateStudentDetailsImplSW implements CreateStudentDetails {

	@Override
	public boolean addStudent(Student student) {

		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();

		try {
			String sql = "insert into student (firstName, lastName, rollNo, age, city, state, gender) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, student.getFirstName());
			ps.setString(2, student.getLastName());
			ps.setInt(3, student.getRollNo());
			ps.setInt(4, student.getAge());
			ps.setString(5, student.getCity());
			ps.setString(6, student.getState());
			ps.setString(7, student.getGender());

			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Added Successfully!");
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Adding student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return flag;
	}

	@Override
	public boolean addStudentByRequiredDetails(int rollNo, String firstName, String lastName) {

		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();

		try {
			String sql = "insert into student (rollNo, firstName, lastName) values(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, rollNo);
			ps.setString(2, firstName);
			ps.setString(3, lastName);

			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Added Successfully!");
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Adding student exception " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Error at the time of closing Connection" + e.getMessage());
			}
		}

		return flag;
	}

}
