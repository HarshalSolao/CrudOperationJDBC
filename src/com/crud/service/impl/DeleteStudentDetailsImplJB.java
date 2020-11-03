package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.crud.model.Student;
import com.crud.service.DeleteStudentDetails;
import com.crud.utility.ConnectionProvider;

public class DeleteStudentDetailsImplJB implements DeleteStudentDetails {

	@Override
	public boolean deleteStudentById(int id) {
		boolean result = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "delete from studentj where id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int val = ps.executeUpdate();
			result = (val > 0) ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	@Override
	public boolean deleteStudentByRollNumber(int rollNo) {
		boolean result = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "delete from studentj whre rollNo =?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(4, rollNo);
			int val = ps.executeUpdate();
			result = (val > 0) ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	@Override
	public boolean deleteStudentByName(String firstName, String lastName) {

		boolean result = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "delete from studentj where firstName = ? and lastName = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			int val = ps.executeUpdate();
			result = (val > 0) ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	@Override
	public boolean deleteStudentByCity(String city) {
		boolean result = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "delete from studentj where city = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, city);
			int val = ps.executeUpdate();
			result = (val > 0) ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	@Override
	public boolean deleteStudentByState(String state) {
		boolean result = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "delete from studentj where state = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, state);
			int val = ps.executeUpdate();
			result = (val > 0) ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	@Override
	public boolean deleteStudent(Student student) {
		boolean result = false;
		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "delete from studentj ";

//		if(student.getId()>0) {
//			sql = sql+" id = " + student.getId();
//			flag = true;
//		}
//		if(student.getRollNo()!=0) {
//			if(flag) {
//				sql = sql + " and rollNo = "+ student.getRollNo();
//			}else {
//				sql = sql + " rollNo = "+ student.getRollNo();
//				flag = true;
//			}
//		}

		sql += " where id = " + student.getId() + " and rollNo = " + student.getRollNo();
		System.out.println(sql);

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
