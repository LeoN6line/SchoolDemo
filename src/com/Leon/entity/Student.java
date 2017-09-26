package com.Leon.entity;

public class Student {
	int sid;
	String sname;
	String ssex;
	String username;
	String dept;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
public Student(){
		
	}
public Student(String sname,String ssex,String username,String dept){
		this.username = username;
		this.sname = sname;
		this.ssex = ssex;
		this.dept = dept;
		
	}
}
