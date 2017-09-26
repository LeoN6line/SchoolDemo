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


public class courseDao {
public static ArrayList<Course> getAll(){
	String sql="select * from t_course ";
	Connection conn = null;
	Statement stmt=null;
	ResultSet rs  = null;
	ArrayList<Course> clist= new ArrayList<Course>();
	
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
			Course course = new Course();
			course.setCid(rs.getInt("cid"));
			course.setCname(rs.getString("cname"));
			course.setTname(rs.getString("tname"));
			course.setCtime(rs.getString("ctime"));
			course.setAddress(rs.getString("address"));;
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
public static Course get(int id) {
	String sql="select * from t_course where cid = ?";
	Connection conn = null;
	PreparedStatement pstmt=null;
	ResultSet rs  = null;
	Course course = null;
	try {
		//3.1 加载驱动
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//3.2 建立连接
		conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
		//3.3 获得语句对象
		//stmt = conn.createStatement();
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		
		//3.4语句对象发送SQL
		rs = pstmt.executeQuery();	
		while(rs.next()){
			 course = new Course(rs.getInt("cid"),rs.getString("cname"),rs.getString("tname"),rs.getString("ctime"),rs.getString("address"));		}
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
	return course;
}
public static void save(Course course) {
	// TODO Auto-generated method stub
	String sql="insert into t_grade(cid,cname,tname,ctime,sname,address) values(?,?,?,?,'刘航',?)";
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
		pstmt.setInt(1,course.getCid() );
		pstmt.setString(2,course.getCname() );
		pstmt.setString(3,course.getTname() );
		pstmt.setString(4,course.getCtime() );
		pstmt.setString(5,course.getAddress() );
		
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
