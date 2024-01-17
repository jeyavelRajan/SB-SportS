package com.rts.evaluation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sports {
	
@Id
    private int id;
    private String name;
	private String password;
	private int age;
	private int mobileno;
	private String email;
	
	
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sports(int id, String name, String password, int age, int mobileno, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.mobileno = mobileno;
		this.email = email;
	}


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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMobileno() {
		return mobileno;
	}


	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Sports [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", mobileno="
				+ mobileno + ", email=" + email + "]";
	}


}