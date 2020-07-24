package com.luv2code.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Reading student obj...");
			session.beginTransaction();
			Student student = session.get(Student.class, 1);
			System.out.println("Student retrieved: " + student);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		} finally {
			factory.close();
		}

	}

}
