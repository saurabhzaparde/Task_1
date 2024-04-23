package com.pojo;

import java.time.LocalDate;

public class Information {

	private int id;
	
	private String name;
	
	private String email;

	private String mob;
	
	private int marks;
		
	private LocalDate cdate=LocalDate.now();
	
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public LocalDate getCdate() {
		return cdate;
	}

	public void setCdate(LocalDate cdate) {
		this.cdate = cdate;
	}
	
}
