package com.Leon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Leon.entity.Qa;
import com.Leon.entity.Review;

public class qaDao {

	public static void save(Qa qa) {
		// TODO Auto-generated method stub
		String sql="insert into t_qa(tname,sname,question) values(?,?,?)";
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
			pstmt.setString(1,qa.getTname() );
			pstmt.setString(2,qa.getSname());
			pstmt.setString(3,qa.getQuestion() );

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
	public static ArrayList<Qa> getAll(){
		
		String sql="select * from t_qa where tname ='李锐'";
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs  = null;
		ArrayList<Qa> clist= new ArrayList<Qa>();
		
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
				Qa course = new Qa();
				course.setId(rs.getInt("id"));
				course.setSname(rs.getString("sname"));
				course.setQuestion(rs.getString("question"));;
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
