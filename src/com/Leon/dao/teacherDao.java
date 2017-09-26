package com.Leon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Leon.entity.Course;
import com.Leon.entity.Student;
import com.Leon.entity.Teacher;

public class teacherDao {

	public static Teacher get(String input_username) {
		String sql="select * from t_teacher where username = ? or sname = ?";
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs  = null;
		Teacher teacher = null;
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
				 teacher = new Teacher(rs.getString("tname"),rs.getString("tsex"),rs.getString("username"));	
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
		return teacher;
	}
public static ArrayList<Teacher> getAll(){
	String sql="select * from t_teacher";
	Connection conn = null;
	Statement stmt=null;
	ResultSet rs  = null;
	ArrayList<Teacher> clist= new ArrayList<Teacher>();
	
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
			Teacher course = new Teacher();
			course.setTid(rs.getInt("tid"));
			course.setTname(rs.getString("tname"));
			course.setUsername(rs.getString("username"));
			course.setTsex(rs.getString("tsex"));;
			clist.add(course);}
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
	return clist;
	
	
}
}
