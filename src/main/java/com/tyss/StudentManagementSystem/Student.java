package com.tyss.StudentManagementSystem;

import java.util.Scanner;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sno;
	private String name;
	private StudentMarks sm;
	
	
	Student(){}
	public Student(int sno, String name,StudentMarks sm) {
		super();
		this.sno = sno;
		this.name = name;
		this.sm=sm;
		
		
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentMarks getSm() {
		return sm;
	}
	public void setSm(StudentMarks sm) {
		this.sm = sm;
	}
	
	
	
	
	

}
