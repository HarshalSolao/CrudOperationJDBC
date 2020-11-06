package com.crud.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crud.model.Student;
import com.crud.service.DeleteStudentDetails;
import com.crud.utility.ConnectionProvider;

public class DeleteStudentDetailsImplSW implements DeleteStudentDetails {

	@Override
	public boolean deleteStudentById(int id) {

		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();

		try {
			String sql = "delete from student where id=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Deleted Successfully!");
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Deleting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}

		return flag;
	}

	@Override
	public boolean deleteStudentByRollNumber(int rollNo) {

		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();

		try {
			String sql = "delete from student where rollNo=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, rollNo);

			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Deleted Successfully!");
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Deleting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return flag;
	}

	@Override
	public boolean deleteStudentByName(String firstName, String lastName) {

		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();

		try {
			String sql = "delete from student where firstName=? and lastName=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, firstName);
			ps.setString(2, lastName);

			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Deleted Successfully!");
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Deleting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return flag;
	}

	@Override
	public boolean deleteStudentByCity(String city) {

		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();

		try {
			String sql = "delete from student where city=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, city);

			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Deleted Successfully!");
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Deleting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return flag;
	}

	@Override
	public boolean deleteStudentByState(String state) {

		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();

		try {
			String sql = "delete from student where state=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, state);

			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Deleted Successfully!");
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Deleting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return flag;
	}

	@Override
	public boolean deleteStudent(Student student) {

		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();

		try {
			String sql = "delete from student";
			sql += " where id = " + student.getId() + " and rollNo = " + student.getRollNo();

			PreparedStatement ps = con.prepareStatement(sql);
			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Deleted Successfully!");
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Deleting student exception " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error at the time of closing Connection" + e.getMessage());
				}
			}
		}
		return flag;
	}

}
