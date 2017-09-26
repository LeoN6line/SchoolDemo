package com.Leon.entity;

public class Review {
int cid;
String cname;
String sname;
String review;
String tname;
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
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public Review(){
	
}
public Review(int cid,String cname,String sname,String review,String tname){
	this.cid=cid;
	this.cname= cname;
	this.sname=sname;
	this.review=review;
	this.tname= tname;
	
}
}
