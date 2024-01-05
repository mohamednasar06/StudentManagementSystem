package com.tyss.StudentManagementSystem;



import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class StudentManagementSystem {
	
	EntityManager entity;
	EntityTransaction transaction;
	Scanner sc=new Scanner(System.in);
	
	
	public StudentManagementSystem(EntityManager entity, EntityTransaction transaction) {
		super();
		this.entity = entity;
		this.transaction = transaction;
	}
	public  StudentManagementSystem(){}
	public void addStudent() {
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter marks1");
		double marks1=sc.nextDouble();
		System.out.println("enter marks2");
		double marks2=sc.nextDouble();
		System.out.println("enter marks3");
		double marks3=sc.nextDouble();
		System.out.println("enter marks4");
		double marks4=sc.nextDouble();
		System.out.println("enter marks5");
		double marks5=sc.nextDouble();
		StudentMarks sm=new StudentMarks(marks1,marks2,marks3,marks4,marks5);
		Student s=new Student(id,name,sm);
		transaction.begin();
		entity.persist(s);
		transaction.commit();
		
	}
	public void removeStudent() {
		transaction.begin();
		System.out.println("enter id to remove");
		Student s=entity.find(Student.class, sc.nextInt());
		if(s==null) {
			System.out.println("data not found");
			transaction.commit();
			
		}
		else {
			entity.remove(s);
			transaction.commit();
			
		}
		
	}
	public void updateStudent() {
		transaction.begin();
		System.out.println("enter id ");
		Student s=entity.find(Student.class, sc.nextInt());
		if(s==null) {
			System.out.println("data not found");
			transaction.commit();
			
		}
		else {
			  System.out.println("what u need to change 1.name 2.marks");
			  switch(sc.nextInt()) {
			  case 1:{
				  System.out.println("enter new Name");
				  s.setName(sc.next());
			  }
				  break;
			  case 2:{
				  StudentMarks sm=s.getSm();
				  System.out.println("which subject u want update please select 1 to 5");
				  int choice=sc.nextInt();
				  if(choice>=1&&choice<=5) {
					  System.out.println("enter new marks");
					  int newmarks=sc.nextInt();
					  switch(choice) {
					  case 1:{
						  sm.setSub1(newmarks);
						  entity.merge(s);
						  break;
						  }
					  case 2:{
						  sm.setSub2(newmarks);
						  entity.merge(s);
						  break;
						  }
					  case 3:{
						  sm.setSub3(newmarks);
						  entity.merge(s);
						  break;
						  }
					  case 4:{
						  sm.setSub4(newmarks);
						  entity.merge(s);
						  break;
						  }
					  case 5:{
						  sm.setSub5(newmarks);
						  entity.merge(s);
						  break;
						  }
					  }
					  
				  }
			  }
				  break;
			  }
			transaction.commit();
			
		}
		
	}
	public void searchStudent() {
		
		System.out.println("enter id ");
		Student s=entity.find(Student.class, sc.nextInt());
		if(s==null) {
			System.out.println("data not found");
			transaction.commit();
			
		}
		else {
			System.out.println(s);
			
			
		}
		
	}
	public void displayStudent() {
		//
		
		
	}
	

}
