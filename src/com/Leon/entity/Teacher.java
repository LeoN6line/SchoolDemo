package com.Leon.entity;

public class Teacher {
int tid;
String tname;
String tsex;
String username;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTsex() {
	return tsex;
}
public void setTsex(String tsex) {
	this.tsex = tsex;
}
public Teacher(){
}
public Teacher(String tname,String tsex,String username){
	this.username = username;
	this.tname = tname;
	this.tsex= tsex;
}
}
