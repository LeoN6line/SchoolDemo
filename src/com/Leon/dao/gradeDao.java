package com.Leon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Leon.entity.Course;
import com.Leon.entity.Grade;

public class gradeDao {
	public static ArrayList<Course> getAll(){
		String sql="select * from t_grade where sname = '����'";
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs  = null;
		ArrayList<Course> clist= new ArrayList<Course>();
		
		try {
			//3.1 ��������
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 ��������
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
			//3.3 ���������
			//stmt = conn.createStatement();
			stmt=conn.createStatement();
			//3.4��������SQL
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

	public static void delete(int cid) {
		// TODO Auto-generated method stub
		String sql="delete from t_grade where cid = ?";
		Connection conn = null;
		PreparedStatement pstmt=null;
	
		
		try {
			//3.1 ��������
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 ��������
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
			//3.3 ���������
			//stmt = conn.createStatement();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, cid);
			
			//3.4��������SQL
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

	public static Course get(int cid) {
		String sql="select * from t_course where cid = ?";
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs  = null;
		Course course = null;
		try {
			//3.1 ��������
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 ��������
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
			//3.3 ���������
			//stmt = conn.createStatement();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, cid);
			
			//3.4��������SQL
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
	
	public static ArrayList<Grade> getAlls(){
		String sql="select * from t_grade where sname = '����'";
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs  = null;
		ArrayList<Grade> clist= new ArrayList<Grade>();
		
		try {
			//3.1 ��������
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 ��������
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root","root");//jdbc url
			//3.3 ���������
			//stmt = conn.createStatement();
			stmt=conn.createStatement();
			//3.4��������SQL
			rs = stmt.executeQuery(sql);	
			while(rs.next()){
				Grade course = new Grade();
				course.setCid(rs.getInt("cid"));
				course.setCname(rs.getString("cname"));
				course.setTname(rs.getString("tname"));
				course.setTime(rs.getString("ctime"));
				course.setAddress(rs.getString("address"));
				course.setGrade(rs.getInt("Grade"));
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
