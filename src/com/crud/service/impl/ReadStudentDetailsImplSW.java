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

public class ReadStudentDetailsImplSW implements ReadStudentDetails {

	@Override
	public Set<Student> getAllStudents() {

		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				Student stu = new Student();
				stu.setId(rs.getInt(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setCity(rs.getString(6));
				stu.setState(rs.getString(7));
				stu.setGender(rs.getString(8));
				students.add(stu);
			}

		} catch (SQLException e) {
			System.out.println("Getting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return students;
	}

	@Override
	public Set<Student> getAllStudentByLastName(String lastName) {

		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {

				if (lastName.equalsIgnoreCase(rs.getString(3))) {
					Student stu = new Student();
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setCity(rs.getString(6));
					stu.setState(rs.getString(7));
					stu.setGender(rs.getString(8));
					students.add(stu);
				}
			}

		} catch (SQLException e) {
			System.out.println("Getting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return students;
	}

	@Override
	public Student getStudentById(int id) {

		Student stu = new Student();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				if (id == rs.getInt(1)) {
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setCity(rs.getString(6));
					stu.setState(rs.getString(7));
					stu.setGender(rs.getString(8));
				}
			}

		} catch (SQLException e) {
			System.out.println("Getting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return stu;
	}

	@Override
	public Student getStudentByRollNumber(int rollNo) {

		Student stu = new Student();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				if (rollNo == rs.getInt(4)) {
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setCity(rs.getString(6));
					stu.setState(rs.getString(7));
					stu.setGender(rs.getString(8));
				}
			}

		} catch (SQLException e) {
			System.out.println("Getting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return stu;
	}

	@Override
	public Set<Student> getStudentByGender(String gender) {

		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {

				if (gender.equalsIgnoreCase(rs.getString(8))) {
					Student stu = new Student();
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setCity(rs.getString(6));
					stu.setState(rs.getString(7));
					stu.setGender(rs.getString(8));
					students.add(stu);
				}
			}

		} catch (SQLException e) {
			System.out.println("Getting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return students;
	}

	@Override
	public Set<Student> getStudentByCity(String city) {

		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {

				if (city.equalsIgnoreCase(rs.getString(6))) {
					Student stu = new Student();
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setCity(rs.getString(6));
					stu.setState(rs.getString(7));
					stu.setGender(rs.getString(8));
					students.add(stu);
				}
			}

		} catch (SQLException e) {
			System.out.println("Getting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return students;
	}

	@Override
	public Set<Student> getStudentByState(String state) {

		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;

		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {

				if (state.equalsIgnoreCase(rs.getString(7))) {
					Student stu = new Student();
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setCity(rs.getString(6));
					stu.setState(rs.getString(7));
					stu.setGender(rs.getString(8));
					students.add(stu);
				}
			}

		} catch (SQLException e) {
			System.out.println("Getting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return students;
	}

	@Override
	public Set<Student> getStudentByGivenInfo(Student student) {

		boolean flag = false;
		Set<Student> students = new HashSet<>();
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
