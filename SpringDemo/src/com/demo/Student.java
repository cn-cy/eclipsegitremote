package com.demo;

public class Student {
private String stuno;
public String getStuno() {
	return stuno;
}
public void setStuno(String stuno) {
	this.stuno = stuno;
}
public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}
private String stuname;
public String toString()
{
	return(this.stuno+"-"+this.stuname);
}

}
