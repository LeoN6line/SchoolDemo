package com.Leon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Leon.entity.User;
import com.Leon.entity.Student;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class loginDao {
	public static boolean login(User user) {
		// TODO Auto-generated method stub
		String sql="select * from t_login where username = ? and password = ? and usertype = ?";
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs  = null;
		int rows  = 0 ;
		//java��DB��������ҪJDBC�������ӿ�JDBC�� ʵ�ֵ������� ����JDBC�ӿ�д���룬����ײ����ض����ݿ�ʵ���������
		//�������ݿ�
		//1. �������� baidu�� ���ݿ������  jdbc driver
		//2. ����web app��Ŀ�� web-inf/lib
		//3. ����
		try {
			//3.1 ��������
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//3.2 ��������
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?" +
				                                   "user=root&password=root");//jdbc url
			//3.3 ���������
			//stmt = conn.createStatement();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getUsertype());
			//3.4��������SQL
			rs = pstmt.executeQuery();	
			while(rs.next()){
				rows++;
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
		return rows>0;
	}
	
	

	
}
