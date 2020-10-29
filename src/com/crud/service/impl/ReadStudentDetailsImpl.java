package com.crud.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.crud.model.Student;
import com.crud.service.ReadStudentDetails;
import com.crud.utility.ConnectionProvider;

public class ReadStudentDetailsImpl implements ReadStudentDetails {

	@Override
	public Set<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Student> getAllStudentByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByRollNumber(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Student> getStudentByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Student> getStudentByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Student> getStudentByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Student> getStudentByGivenInfo(Student student) {
		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		String sql = "";
		if (student.getId() > 0) {
			sql = "SELECT * FROM STUDENT where id =" + student.getId();
		} else if (student.getRollNo() != 0) {
			sql = "SELECT * FROM STUDENT where rollNo =" + student.getRollNo();
		} else if (student.getFirstName() != null) {
			sql = "SELECT * FROM STUDENT where firstName =" + "'" + student.getFirstName() + "'";
		} else if (student.getLastName() != null) {
			sql = "SELECT * FROM STUDENT where lastName =" + "'" + student.getLastName() + "'";
		} else if (student.getGender() != null) {
			sql = "SELECT * FROM STUDENT where gender =" + "'" +student.getGender() + "'";
		}

		System.out.println(sql);
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Student stu = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7), rs.getString(8));

				students.add(stu);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}

		return students;
	}

}
