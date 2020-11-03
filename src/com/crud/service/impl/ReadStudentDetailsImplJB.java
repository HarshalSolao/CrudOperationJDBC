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

public class ReadStudentDetailsImplJB implements ReadStudentDetails {
	Set<Student> students = new HashSet<>();
	Statement stmt;
	Connection con = ConnectionProvider.getConnection();

	@Override
	public Set<Student> getAllStudents() {
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from studentj");
			while(rs.next()) {
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
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e) {
					System.out.println("Error at the time of Connection close " + e.getMessage());
				}
			}
		}
		
		return students;
	}

	@Override
	public Set<Student> getAllStudentByLastName(String lastName) {
		Set<Student> students1 = new HashSet<>();
		Statement stmt;
		Connection con = ConnectionProvider.getConnection();
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from studentj");
			while(rs.next()) {
				if(rs.getString(3).equals(lastName)) {
					Student stu = new Student();
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setGender(rs.getString(6));
					stu.setCity(rs.getString(7));
					stu.setState(rs.getString(8));
				
					
					students1.add(stu);
					
				}
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e) {
					System.out.println("Error at the time of Connection close " + e.getMessage());
				}
			}
		}

		
		return students1;
	}

	@Override
	public Student getStudentById(int id) {
		
		Statement stmt;
		ConnectionProvider.getConnection();
		Student stu = new Student();
		try {
			stmt = ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from studentj");
			while(rs.next()) {
				
				if(rs.getInt(1) == id ) {
					
//					Student stu = new Student();
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
			
			
		} catch (SQLException e) {					
			e.printStackTrace();
		}
		return stu;
		
	}

	@Override
	public Student getStudentByRollNumber(int rollNo) {
		Statement stmt;
		ConnectionProvider.getConnection();
		Student stu = new Student();
		try {
			stmt = ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				
				if(rs.getInt(4) == rollNo ) {
					
//					Student stu = new Student();
//					stu.setId(rs.getInt(1));
//					stu.setFirstName(rs.getString(2));
//					stu.setLastName(rs.getString(3));
//					stu.setRollNo(rs.getInt(4));
//					stu.setAge(rs.getInt(5));	
//					stu.setGender(rs.getString(6));
//					stu.setCity(rs.getString(7));
//					stu.setState(rs.getString(8));
					
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));				
					stu.setCity(rs.getString(6));
					stu.setState(rs.getString(7));
					return stu;
					
					
					
				}
							
			}
			
			
		} catch (SQLException e) {					
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e) {
					System.out.println("Error at the time of Connection close " + e.getMessage());
				}
			}
		}
		
		return stu;
	}

	@Override
	public Set<Student> getStudentByGender(String gender) {
		Set<Student> gen = new HashSet<>();
		Statement stmt;
		ConnectionProvider.getConnection();
		try {
			stmt = ConnectionProvider.getConnection().createStatement();
			ResultSet rs =stmt.executeQuery("select * from studentj");
			while(rs.next()) {
				if(rs.getString(6).equals(gender)) {
					Student stu = new Student();
					
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setGender(rs.getString(6));
					stu.setCity(rs.getString(7));
					stu.setState(rs.getString(8));
					gen.add(stu);
				}
			
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return gen;
	}

	@Override
	public Set<Student> getStudentByCity(String city) {
		Set<Student> citys = new HashSet<>();
		Statement sts ;
		ConnectionProvider.getConnection();
	try {
		sts = ConnectionProvider.getConnection().createStatement();
		ResultSet rs =sts.executeQuery("select * from studentj");
		while(rs.next()) {
			Student stu = new Student();
			if(rs.getString(7).equals(city)) {
				stu.setId(rs.getInt(1));
				stu.setFirstName(rs.getString(2));
				stu.setLastName(rs.getString(3));
				stu.setRollNo(rs.getInt(4));
				stu.setAge(rs.getInt(5));
				stu.setGender(rs.getString(6));
				stu.setCity(rs.getString(7));
				stu.setState(rs.getString(8));
				citys.add(stu);
			}
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		if(con!=null) {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println("Error at the time of Connection close " + e.getMessage());
			}
		}
	}
		return citys;
	}

	@Override
	public Set<Student> getStudentByState(String state) {
		Set<Student> states = new HashSet<>();
		Statement stmt ;
		ConnectionProvider.getConnection();
		try {
			stmt = ConnectionProvider.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from studentj");
			while(rs.next()) {
				Student stu = new Student();
				if(rs.getString(8).equals(state)) {
					stu.setId(rs.getInt(1));
					stu.setFirstName(rs.getString(2));
					stu.setLastName(rs.getString(3));
					stu.setRollNo(rs.getInt(4));
					stu.setAge(rs.getInt(5));
					stu.setGender(rs.getString(6));
					stu.setCity(rs.getString(7));
					stu.setState(rs.getString(8));
					states.add(stu);
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e) {
					System.out.println("Error at the time of Connection close " + e.getMessage());
				}
			}
		}
		
		
		return states;
	}

	@Override
	public Set<Student> getStudentByGivenInfo(Student student) {
		Set<Student> student1 = new HashSet<>();
		boolean flag = false;
		Connection con = ConnectionProvider.getConnection();
		String sql = "select * from studentj where ";
		
		if(student.getId()>0) {
			sql = sql + " id = " + student.getId();
			flag = true;
		}
		
		if(student.getRollNo() !=0) {
			if(flag) {
				sql =sql + " and rollNo = " +student.getRollNo();
			}else {
				sql = sql + " rollNo = " + student.getRollNo();
				flag = true;
				
			}
		}
		if(student.getFirstName() != null) {
			if(flag) {
				sql = sql + " and firstName = "+ "'" + student.getFirstName() + "'";
			}else {
				sql = sql + " firstName " + "'" + student.getFirstName() + "'";
				flag = true;
			}
		}
		if(student.getLastName()!=null) {
			if(flag) {
				sql = sql + " and lastName  = " + "'" + student.getLastName() + "'";
			}else {
				sql = sql + " lastName = " + "'" + student.getLastName() + "'";
				flag =true;
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

				student1.add(stu);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error at the time of fetching data " + e.getMessage());
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (Exception e) {
					System.out.println("Error at the time of Connection close " + e.getMessage());
				}
			}
		}
		
		
		
		return student1;
	}

}
