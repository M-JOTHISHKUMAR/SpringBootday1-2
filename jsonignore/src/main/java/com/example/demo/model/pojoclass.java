package com.example.demo.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;

public class pojoclass {
private int id;
private String name;
private String dept;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public pojoclass(int id, String name, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
}
public pojoclass() {
	
}
}
