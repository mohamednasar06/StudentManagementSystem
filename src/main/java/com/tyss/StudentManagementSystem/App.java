package com.tyss.StudentManagementSystem;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev") ;
   	 EntityManager em = emf.createEntityManager()  ;
   	 EntityTransaction et = em.getTransaction() ;
   	 StudentManagementSystem sms=new StudentManagementSystem(em,et);
   	 Scanner sc=new Scanner(System.in);
            
            for(;;) {
            	System.out.println("1.addstudent 2.remove student 3.update student 4.search student 5.display student 6.exit");
            	switch(sc.nextInt()) {
            	case 1:
            		sms.addStudent();
            		break;
            	case 2:
            		sms.removeStudent();
            		break;
            	case 3:
            		sms.updateStudent();
            		break;
            	case 4:
            		sms.searchStudent();
            		break;
            	case 5:
            		sms.displayStudent();
            		break;
            	case 6:
            		return;
            	}
            
            	
            }
    }
}
