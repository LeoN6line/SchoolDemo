package com.Leon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Leon.entity.Student;

public class studentDao {
	
	public static Student get(String input_username) {
		String sql="select * from t_student where username = ? or sname = ?";
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs  = null;
		Student stu = null;
		try {
			//3.1 加载驱动
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 建立连接
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
			//3.3 获得语句对象
			//stmt = conn.createStatement();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, input_username);
			pstmt.setString(2, input_username);
			//3.4语句对象发送SQL
			rs = pstmt.executeQuery();	
			while(rs.next()){
				 stu = new Student(rs.getString("sname"),rs.getString("ssex"),rs.getString("username"),rs.getString("dept"));	
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					pstmt=null;
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					conn=null;
				}
			}
		}
		return stu;
	}

	public static ArrayList<Student> getAll() {
		String sql="select * from t_student";
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs  = null;
		ArrayList<Student> slist= new ArrayList<Student>();
		
		try {
			//3.1 加载驱动
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 建立连接
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
			//3.3 获得语句对象
			//stmt = conn.createStatement();
			stmt=conn.createStatement();
			//3.4语句对象发送SQL
			rs = stmt.executeQuery(sql);	
			while(rs.next()){
				Student stu = new Student();
				stu.setSid(rs.getInt("sid"));
				stu.setSname(rs.getString("sname"));
				stu.setSsex(rs.getString("ssex"));
				stu.setDept(rs.getString("dept"));
				stu.setUsername(rs.getString("username"));
				slist.add(stu);}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(stmt!=null){
				try {
					stmt.close();
				} catch (SQLException e) {
					stmt=null;
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					conn=null;
				}
			}
		}
		return slist;
	}

	public static void save(Student stu) {
		// TODO Auto-generated method stub
		String sql="insert into t_student(sname,ssex,username,dept) values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt=null;
		

		try {
			//3.1 加载驱动
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 建立连接
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
			//3.3 获得语句对象
			//stmt = conn.createStatement();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,stu.getSname() );
			pstmt.setString(2,stu.getSsex() );
			pstmt.setString(3,stu.getUsername() );
			pstmt.setString(4,stu.getDept() );
		
			
			//3.4语句对象发送SQL
			 pstmt.executeUpdate();	
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					pstmt=null;
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					conn=null;
				}
			}
		}
	}

	public static void delete(int sid) {
		// TODO Auto-generated method stub
		String sql="delete from t_student where sid = ?";
		Connection conn = null;
		PreparedStatement pstmt=null;
	
		
		try {
			//3.1 加载驱动
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 建立连接
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
			//3.3 获得语句对象
			//stmt = conn.createStatement();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, sid);
			
			//3.4语句对象发送SQL
			pstmt.executeUpdate();	
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					pstmt=null;
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					conn=null;
				}
			}
		
	
		}
}
}


