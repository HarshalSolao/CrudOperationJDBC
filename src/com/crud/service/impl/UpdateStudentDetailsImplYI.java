package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.crud.model.Student;
import com.crud.service.UpdateStudentDetails;
import com.crud.utility.ConnectionProvider;

public class UpdateStudentDetailsImplYI implements UpdateStudentDetails {
	Connection connection=ConnectionProvider.getConnection(); 
	Statement sta; 
	@Override
	public boolean updateStudentDetails(Student student) {
		
		boolean result = false;
		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "UPDATE student SET ";

		if (student.getFirstName() != null) {
			sql += "firstName =" + "'" + student.getFirstName() + "'";
			flag = true;
		}
		if (student.getLastName() != null) {
			if (flag) {
				sql += " ,lastName =" + "'" + student.getLastName() + "'";
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

	@Override
	public boolean updateStudentById(int id, Student student) {
		boolean result = false;
		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "UPDATE student SET ";

		if (student.getFirstName() != null) {
			sql += "firstName =" + "'" + student.getFirstName() + "'";
			flag = true;
		}
		if (student.getLastName() != null) {
			if (flag) {
				sql += " ,lastName =" + "'" + student.getLastName() + "'";
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
		
		sql += " where id = " + id;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			int val = ps.executeUpdate();
			result = (val > 0) ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean updateStudentByRollNumber(int rollNo, Student student) {
		boolean result = false;
		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "UPDATE student SET ";

		if (student.getFirstName() != null) {
			sql += "firstName =" + "'" + student.getFirstName() + "'";
			flag = true;
		}
		if (student.getLastName() != null) {
			if (flag) {
				sql += " ,lastName =" + "'" + student.getLastName() + "'";
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
		
		sql += " where rollNo = " + rollNo;

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
