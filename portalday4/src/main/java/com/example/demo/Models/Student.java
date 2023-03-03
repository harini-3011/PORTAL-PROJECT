package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
	private int id;
	private String studentName;
	private String departementName;
	private String mailid;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String studentName, String departementName, String mailid) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.departementName = departementName;
		this.mailid = mailid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartementName() {
		return departementName;
	}

	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
}