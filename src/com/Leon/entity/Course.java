package com.Leon.entity;

public class Course {

int cid;
 String cname;
 String tname;
 String ctime;
 String address;
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
public String getCtime() {
	return ctime;
}
public void setCtime(String ctime) {
	this.ctime = ctime;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 public Course(){}
 public Course(int cid ,String cname,String tname,String ctime,String address){
	 this.cid=cid;
	 this.cname=cname;
	 this.tname = tname;
	 this.ctime=ctime;
	 this.address = address;
 }
}
