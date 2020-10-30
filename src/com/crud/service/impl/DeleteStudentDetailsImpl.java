package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crud.model.Student;
import com.crud.service.DeleteStudentDetails;
import com.crud.utility.ConnectionProvider;

public class DeleteStudentDetailsImpl implements DeleteStudentDetails{

	@Override
	public boolean deleteStudentById(int id) {
		boolean result = false;
		Connection con = ConnectionProvider.getConnection();	
		String sql = "DELETE FROM STUDENT where id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int val = ps.executeUpdate();
			result = (val > 0) ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudentByName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudentByCity(String city) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudentByState(String state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
