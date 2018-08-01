package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	
	 public static void  main (String [] args) {
		 
		 SessionFactory factory = null;
		 try {
		 //Create Session Factory 
		 System.out.println("Creating factory object..");
		  factory = new Configuration().configure("hibernate.cfg.xml")
				 .addAnnotatedClass(Student.class).buildSessionFactory();
		 
		 //Create session
		 System.out.println("Creating Session object..");
		 Session session = factory.getCurrentSession();
		 
		 //Create a Student obj
		// System.out.println("Creating Student object..");
		// Student s1 = new Student("Pankaj","Saraf","pankaj.saraf@gmail.com");
		 
		 //start a transaction
		 System.out.println("Starting transaction..");
		 session.beginTransaction();
		 
		 //query student
		 System.out.println("Creating query ..");
		 List<Student> theStudents =session.createQuery("from Student").list();
		 
		 //display student
		 System.out.println("Displaying query ..");
		 for(Student s:theStudents) {
			 System.out.println(theStudents);
		 }
		 
		 
		 //Save Student class to db
		// System.out.println("Save Student class to DB");
		// session.save(s1);
		 
		 //Commit transaction
		 session.getTransaction().commit();
		 
		 System.out.println("Done!");
		 }catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 factory.close();;
		 }
	 }
	 
	 
}
