package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Child{
    @Id
	private int babyId;
    private String babyFirstName;
	private String babyLastName;
	private String fatherName;
	private String mothername;
	private String addresss;
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(int babyId, String babyFirstName, String babyLastName, String fatherName, String mothername,
			String addresss) {
		super();
		this.babyId = babyId;
		this.babyFirstName = babyFirstName;
		this.babyLastName = babyLastName;
		this.fatherName = fatherName;
		this.mothername = mothername;
		this.addresss = addresss;
	}
	
	
	public int getBabyId() {
		return babyId;
	}

	public void setBabyId(int babyId) {
		this.babyId = babyId;
	}

	public String getBabyFirstName() {
		return babyFirstName;
	}

	public void setBabyFirstName(String babyFirstName) {
		this.babyFirstName = babyFirstName;
	}

	public String getBabyLastName() {
		return babyLastName;
	}

	public void setBabyLastName(String babyLastName) {
		this.babyLastName = babyLastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	


	
}