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

public class DeleteStudentDetailsImplYI  implements DeleteStudentDetails{
	
	Connection connection=ConnectionProvider.getConnection();
	 PreparedStatement ps; 
	 @Override 
	public boolean deleteStudentById(int id) { 
		 String sql="DELETE FROM student where id=?";	  
		 try {
			ps = connection.prepareStatement(sql); 
			ps.setInt(1,id); 
			int  b=ps.executeUpdate(); 
			if(b>0) { 
				System.out.println("Deleted successfully");
			}
		} catch ( SQLException e1) {
			e1.printStackTrace();
		}
		 finally { 
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return false;
	}

	@Override
	public boolean deleteStudentByRollNumber(int rollNo) {
		 String sql="DELETE FROM student where rollNo=?";	  
		 try {
			ps = connection.prepareStatement(sql); 
			ps.setInt(1,rollNo); 
			int  b=ps.executeUpdate(); 
			if(b>0) { 
				System.out.println("Deleted successfully");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		 finally { 
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return false;
	}

	@Override
	public boolean deleteStudentByName(String firstName, String lastName) {
		 String sql="DELETE FROM student where firstName=? and lastName=?";	  
		 try {
			ps = connection.prepareStatement(sql); 
			ps.setString(1,firstName);  
			ps.setString(2,lastName); 
			int  b=ps.executeUpdate(); 
			if(b>0) { 
				System.out.println("Deleted successfully");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		 finally { 
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return false;
	}

	@Override
	public boolean deleteStudentByCity(String city) {
		 String sql="DELETE FROM student where city=?";	  
		 try {
			ps = connection.prepareStatement(sql); 
			ps.setString(1,city); 
			int  b=ps.executeUpdate(); 
			if(b>0) { 
				System.out.println("Deleted successfully");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		 finally { 
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return false;
	}

	@Override
	public boolean deleteStudentByState(String state) {
		 String sql="DELETE FROM student where state=?";	  
		 try {
			ps = connection.prepareStatement(sql); 
			ps.setString(1,state); 
			int  b=ps.executeUpdate(); 
			if(b>0) { 
				System.out.println("Deleted successfully");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		 finally { 
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return false;
	}

	@Override
	public boolean deleteStudent(Student student) {
		boolean result = false;
		
		Connection con = ConnectionProvider.getConnection();
		String sql = "DELETE FROM student ";

		sql += " where rollNo = " +student.getRollNo()+" and "+" id ="+student.getId(); 

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			int val = ps.executeUpdate();
			result = (val > 0) ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

}
