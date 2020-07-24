package com.luv2code.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating objects...");
			
			Instructor inst = new Instructor("Chad", "Darby", "chad@gmail.com");
			InstructorDetail instDet = new InstructorDetail("luv2code Channel", "Coding");
			inst.setInstructorDetail(instDet);
			
			session.beginTransaction();
			session.save(inst);
			session.getTransaction().commit();
			System.out.println("Done!");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		} finally {
			factory.close();
		}
	}

}
