package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.crud.model.Student;
import com.crud.service.DeleteStudentDetails;
import com.crud.utility.ConnectionProvider;

public class DeleteStudentDetailsImplSM implements DeleteStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteStudentById(int id) { 
		//DELETING THE DATA	
		int c =0;
		
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
		try {
			stmt =ConnectionProvider.getConnection().createStatement();
			
			
			String sql = "Delete From student where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			 c = ps.executeUpdate();

			if (c > 0) {
				System.out.println("Data deleted succesfully");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		return (c > 0) ? true : false;
	}



	@Override
	public boolean deleteStudentByRollNumber(int rollNo) {
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
	int result =0;
		try {	
		String sql = "Delete From student where rollNo =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, rollNo);

		 result = ps.executeUpdate();

		if (result > 0) {
			System.out.println("Data deleted succesfully");
		}

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	return (result > 0) ? true : false;
	}

	

	@Override
	public boolean deleteStudentByName(String firstName, String lastName) {
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
	int result =0;
		try {	
		String sql = "Delete From student where firstName=?,lastName=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, firstName);
        ps.setString(2,lastName);
		 result = ps.executeUpdate();

		if (result > 0) {
			System.out.println("Data deleted succesfully");
		}

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	return (result > 0) ? true : false;
	}

	@Override
	public boolean deleteStudentByCity(String city) {
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
	int result =0;
		try {	
		String sql = "Delete From student where city =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, city);

		 result = ps.executeUpdate();

		if (result > 0) {
			System.out.println("Data deleted succesfully");
		}

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	return (result > 0) ? true : false;
	}

	@Override
	public boolean deleteStudentByState(String state) {
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
	int result =0;
		try {	
		String sql = "Delete From student where state =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, state);

		 result = ps.executeUpdate();

		if (result > 0) {
			System.out.println("Data deleted succesfully");
		}

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	return (result > 0) ? true : false;
	}

	@Override
	public boolean deleteStudent(Student student) {
int c =0;
		
		Connection con = ConnectionProvider.getConnection();
		Statement stmt;
		Student stu = new Student();
		try {
			stmt =ConnectionProvider.getConnection().createStatement();
			
			
			String sql = "Delete From Student ";
			sql += " where rollNo =" +student.getRollNo() + "and"+ "id ="+student.getId();
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			 c = ps.executeUpdate();

			if (c > 0) {
				System.out.println("Data deleted succesfully");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			
		return (c > 0) ? true : false;
	}

}
