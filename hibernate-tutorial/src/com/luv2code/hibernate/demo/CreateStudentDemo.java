package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	
	 public static void  main (String [] args) {
		 
		 
		 try {
		 //Create Session Factory //
		 System.out.println("Creating factory object..");
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				 .addAnnotatedClass(Student.class).buildSessionFactory();
		 
		 //Create session
		 System.out.println("Creating Session object..");
		 Session session = factory.getCurrentSession();
		 
		 //Create a Student obj
		 System.out.println("Creating Student object..");
		 Student s1 = new Student("Pankaj","Saraf","pankaj.saraf@gmail.com");
		 
		 //start a transaction
		 System.out.println("Starting transaction..");
		 session.beginTransaction();
		 
		 //Save Student class to db
		 System.out.println("Save Student class to DB");
		 session.save(s1);
		 
		 //Commit transaction
		 session.getTransaction().commit();
		 
		 System.out.println("Done!");
		 }catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 //factory.clo
		 }
	 }
	 
	 
}
