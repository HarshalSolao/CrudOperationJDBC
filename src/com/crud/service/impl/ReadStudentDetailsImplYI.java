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

public class ReadStudentDetailsImplYI implements ReadStudentDetails{

	Connection connection=ConnectionProvider.getConnection(); 
	Statement sta; 
	
	@Override
	public Set<Student> getAllStudents() {
		Set<Student>stuset=new HashSet<>();
		try { 
			
			sta=connection.createStatement(); 
			ResultSet rs=sta.executeQuery("select * from student"); 
			while(rs.next()) { 
				Student stu=new Student(); 
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
			}
			catch(SQLException e) { 
				e.printStackTrace();
			} 
		
		return stuset;
	}

	@Override
	public Set<Student> getAllStudentByLastName(String lastName) { 
		Set<Student>stuset=new HashSet<>();
		try {
			sta=connection.createStatement(); 
			ResultSet rs=sta.executeQuery("select * from student"); 
			while(rs.next()) {  
				if(rs.getString(6).equals(lastName)) {
				Student stu=new Student(); 
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
			}
			}
			catch(SQLException e) { 
				e.printStackTrace();
			} 
		
		return stuset;
	
	}

	@Override
	public Student getStudentById(int id) { 
	Student stu=new Student();
		try {
			sta=connection.createStatement(); 
			ResultSet rs=sta.executeQuery("select * from student"); 
			while(rs.next()) {  
				if(rs.getInt(1)==id) {
				stu.setId(rs.getInt(1)); 
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				return stu; 
				}
			}
			}
			catch(SQLException e) { 
				e.printStackTrace();
			} 
		
		return stu;
	}

	@Override
	public Student getStudentByRollNumber(int rollNo) {
		Student stu1=new Student();
		try {
			sta=connection.createStatement(); 
			ResultSet rs=sta.executeQuery("select * from student"); 
			while(rs.next()) {  
				if(rs.getInt(4)==rollNo) {
				Student stu=new Student(); 
				stu.setId(rs.getInt(1)); 
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				return stu; 
				}
			}
			}
			catch(SQLException e) { 
				e.printStackTrace();
			} 
		finally { 
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return stu1;
	}

	@Override
	public Set<Student> getStudentByGender(String gender) {
		Set<Student>stuset=new HashSet<>();
		try {
			sta=connection.createStatement(); 
			ResultSet rs=sta.executeQuery("select * from student"); 
			while(rs.next()) {  
				if(rs.getString(6).equals(gender)) {
				Student stu=new Student(); 
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
			}
			}
			catch(SQLException e) { 
				e.printStackTrace();
			} 
		
		return stuset;
	}

	@Override
	public Set<Student> getStudentByCity(String city) {
		Set<Student>stuset=new HashSet<>();
		try {
			sta=connection.createStatement(); 
			ResultSet rs=sta.executeQuery("select * from student"); 
			while(rs.next()) {  
				if(rs.getString(7).equals(city)) {
				Student stu=new Student(); 
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
			}
			}
			catch(SQLException e) { 
				e.printStackTrace();
			} 
		
		return stuset;
	}

	@Override
	public Set<Student> getStudentByState(String state) {
		Set<Student>stuset=new HashSet<>();
		try {
			sta=connection.createStatement(); 
			ResultSet rs=sta.executeQuery("select * from student"); 
			while(rs.next()) {  
				if(rs.getString(8).equals(state)) {
				Student stu=new Student(); 
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
			}
			}
			catch(SQLException e) { 
				e.printStackTrace();
			} 
		
		return stuset;
	}

	@Override
	public Set<Student> getStudentByGivenInfo(Student student) {
		Set<Student>stuset=new HashSet<>();
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

				stuset.add(stu);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}
	       return stuset;
	}

}
