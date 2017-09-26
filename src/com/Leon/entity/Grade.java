package com.Leon.entity;

public class Grade {
	int cid;
	String cname;
	String tname;
	String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	String time;
	String address;
	int grade;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Grade(){
		
	}
	public Grade(int cid,String cname,String tname,String time ,String address,int grade,String sname){
		this.cid=cid;
		this.cname=cname;
		this.tname =tname;
		this.time = time;
		this.address = address;
		this.grade = grade;
		this.sname = sname;
		
	}
}
