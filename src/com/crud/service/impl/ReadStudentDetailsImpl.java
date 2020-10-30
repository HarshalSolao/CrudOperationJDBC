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
		boolean flag = false;

		Connection con = ConnectionProvider.getConnection();
		String sql = "SELECT * FROM STUDENT where ";
		
		if (student.getId() > 0) {
			sql = sql + "id = " + student.getId();
			flag = true;
		}
		if (student.getRollNo() != 0) {

			if (flag) {
				sql += " and rollNo =" + student.getRollNo();
			} else {
				sql += "rollNo =" + student.getRollNo();
				flag = true;
			}

		}
		if (student.getFirstName() != null) {
			if (flag) {
				sql += " and firstName =" + "'" + student.getFirstName() + "'";
			} else {
				sql += "firstName =" + "'" + student.getFirstName() + "'";
				flag = true;
			}
		}
		if (student.getLastName() != null) {
			if (flag) {
				sql += " and lastName =" + "'" + student.getLastName() + "'";
			} else {
				sql += "lastName =" + "'" + student.getLastName() + "'";
				flag = true;
			}
		}
		if (student.getGender() != null) {
			if (flag) {
				sql += " and gender =" + "'" + student.getGender() + "'";
			} else {
				sql += "gender =" + "'" + student.getGender() + "'";
				flag = true;
			}
		}
		if (student.getAge() != 0) {
			if (flag) {
				sql += " and age =" + student.getAge();
			} else {
				sql += "age =" + student.getAge();
				flag = true;
			}
		}
		if (student.getCity() != null) {
			if (flag) {
				sql += " and city =" + "'" + student.getCity() + "'";
			} else {
				sql += "city =" + "'" + student.getCity() + "'";
				flag = true;
			}
		}
		if (student.getState() != null) {
			if (flag) {
				sql += " and state =" + "'" + student.getState() + "'";
			} else {
				sql += "state =" + "'" + student.getState() + "'";
				flag = true;
			}
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
