package com.tyss.StudentManagementSystem;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
@Embeddable
public class StudentMarks {
	
	
	private double sub1;
	private double sub2;
	private double sub3;
	private double sub4;
	private double sub5;
	public StudentMarks( double sub1, double sub2, double sub3, double sub4, double sub5) {
		super();
	
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}
	 StudentMarks(){}
	public double getSub1() {
		return sub1;
	}
	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}
	public double getSub2() {
		return sub2;
	}
	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}
	public double getSub3() {
		return sub3;
	}
	public void setSub3(double sub3) {
		this.sub3 = sub3;
	}
	public double getSub4() {
		return sub4;
	}
	public void setSub4(double sub4) {
		this.sub4 = sub4;
	}
	public double getSub5() {
		return sub5;
	}
	public void setSub5(double sub5) {
		this.sub5 = sub5;
	}
	@Override
	public String toString() {
		return "StudentMarks [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", sub4=" + sub4 + ", sub5=" + sub5
				+ "]";
	}
	 
	
	

}
