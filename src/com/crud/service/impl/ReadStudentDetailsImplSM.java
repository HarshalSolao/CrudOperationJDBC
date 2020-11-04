package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.crud.model.Student;
import com.crud.service.ReadStudentDetails;
import com.crud.utility.ConnectionProvider;

public class ReadStudentDetailsImplSM implements ReadStudentDetails {


	Connection connection = ConnectionProvider.getConnection();
	Statement sta;
	@Override
	public Set<Student> getAllStudents() {
		Set<Student> stuset = new HashSet<>();
		

		try {
			sta = connection.createStatement();
			ResultSet rs = sta.executeQuery("select * from student");

			while (rs.next()) {

				Student stu = new Student();
				stu.setId(rs.getInt(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				
				stuset.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return stuset;
	}

	@Override
	public Set<Student> getAllStudentByLastName(String lastName) {
		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		
		try {
			stmt =ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				
				if(rs.getString(2).equals(lastName)) {
					
				
					
				Student stu = new Student();
				stu.setId(rs.getInt(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				students.add(stu);
			}}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}

		return students;
	}

	@Override
	public Student getStudentById(int id) {
		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
		try {
			stmt =ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				
				if(rs.getInt(1)==id) {
					
				
					
				
				stu.setId(rs.getInt(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				students.add(stu);
			}}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}

		return stu ;
	}


	@Override
	public Student getStudentByRollNumber(int rollNo) {
		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
		try {
			stmt =ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				
				if(rs.getInt(4)==rollNo) {
					
				
					
				
				stu.setId(rs.getInt(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				students.add(stu);
			}}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}

		return stu ;
	}


	@Override
	public Set<Student> getStudentByGender(String gender) {
		// TODO Auto-generated method stub
		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
		try {
			stmt =ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				
				if(rs.getString(6)==gender) {
					
				
					
				
				stu.setId(rs.getInt(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				students.add(stu);
			}}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}

		return students ;
	}



	@Override
	public Set<Student> getStudentByCity(String city) {
		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
		try {
			stmt =ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				
				if(rs.getString(7)==city) {
					
				
					
				
				stu.setId(rs.getInt(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				students.add(stu);
			}}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}

		return students ;
	}


	@Override
	public Set<Student> getStudentByState(String state) {
		Set<Student> students = new HashSet<>();
		Connection con = ConnectionProvider.getConnection();
		String sql = "";// TODO Auto-generated method stub
		
		if (state != null) {
			sql = "SELECT * FROM STUDENT where state =" + "'" +state + "'";
		}

		System.out.println(sql);
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Student stu = new Student();

				students.add(stu);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}

		return students;
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
				sql += " , rollNo =" + student.getRollNo();
			} else {
				sql += "rollNo =" + student.getRollNo();
				flag = true;
			}

		}
		if (student.getFirstName() != null) {
			if (flag) {
				sql += " , firstName =" + "'" + student.getFirstName() + "'";
			} else {
				sql += "firstName =" + "'" + student.getFirstName() + "'";
				flag = true;
			}
		}
		if (student.getLastName() != null) {
			if (flag) {
				sql += " , lastName =" + "'" + student.getLastName() + "'";
			} else {
				sql += "lastName =" + "'" + student.getLastName() + "'";
				flag = true;
			}
		}
		if (student.getGender() != null) {
			if (flag) {
				sql += " , gender =" + "'" + student.getGender() + "'";
			} else {
				sql += "gender =" + "'" + student.getGender() + "'";
				flag = true;
			}
		}
		if (student.getAge() != 0) {
			if (flag) {
				sql += " , age =" + student.getAge();
			} else {
				sql += "age =" + student.getAge();
				flag = true;
			}
		}
		if (student.getCity() != null) {
			if (flag) {
				sql += " , city =" + "'" + student.getCity() + "'";
			} else {
				sql += "city =" + "'" + student.getCity() + "'";
				flag = true;
			}
		}
		if (student.getState() != null) {
			if (flag) {
				sql += " , state =" + "'" + student.getState() + "'";
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
