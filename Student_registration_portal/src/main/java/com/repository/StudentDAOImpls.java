package com.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.entity.Student;
import com.model.StudentModel;

@Repository
public class StudentDAOImpls implements StudentDAO {
	static SessionFactory factory;

	static {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static SessionFactory getSessionFactory() {
		return factory;
	}

	public boolean check(StudentModel m) {
		Session session = getSessionFactory().openSession();
		System.out.println(m.getId());
		if (m.getId() != 0)
			return true;
		String sql = "SELECT firstName FROM studentInfo where emailAddress='" + m.getEmailAddress() + "'";

		Query query = session.createNativeQuery(sql, Student.class);
		if (!query.getResultList().isEmpty())
			return false;
		session.close();
		return true;
	}

	public boolean saveStudent(Student student) {
		System.out.println(student);
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		try {
			session.saveOrUpdate(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			return false;

		} finally {
			session.close();
		}
		return true;
	}

	public boolean deleteStudent(int id) {

		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Student student;
		try {
			student = session.get(Student.class, id);
			session.delete(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			return false;

		} finally {
			session.close();
		}
		return true;
	}

	public Student getSingleStudent(int id) {

		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Student student;
		try {
			student = session.get(Student.class, id);
			session.getTransaction().commit();
			return student;
		} catch (Exception e) {
			return null;

		} finally {
			session.close();
		}
	}

	public List<Student> getStudentDetails() {

		Session session = getSessionFactory().openSession();

		try {
//	  	        String hql = "FROM Student"; 
//	        Query<Student> query = session.createQuery(hql, Student.class);
//	        List<Student> students = query.getResultList();

			String sql = "SELECT * FROM studentInfo";
			Query<Student> query = session.createNativeQuery(sql, Student.class);
			List<Student> students = query.getResultList();

//			if (!students.isEmpty()) {
//				for (Student student : students) {
//					System.out.println("ID: " + student.getId() + ", Name: " + student.getFirstName());
//				}
//			} else {
//				System.out.println("No students found!");
//			}
			return students;
		} catch (Exception e) {

			System.out.println(e.getMessage());
			return null;

		} finally {
			session.close();
		}
	}

}
