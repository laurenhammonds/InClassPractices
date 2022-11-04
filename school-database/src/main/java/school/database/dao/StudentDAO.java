package school.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import school.database.entity.Student;

public class StudentDAO {

	// this is the meachanics of getting a record from the database
	public Student findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		String hql = "SELECT s FROM Student s where s.id = :pk";

		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("pk", id);

		Student result = query.getSingleResult();

		t.commit();
		factory.close();
		session.close();

		return result;
	}

	public List<Student> findByLastName(String lastname) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		String hql = "SELECTsc FROM Student s where s.lastname = :lastname";

		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("lastname", lastname);

		List<Student> result = query.getResultList();

		t.commit();
		factory.close();
		session.close();

		return result;
	}

	// HOMEWORK - make a new function that has a query that uses a like statement so
	// I can find all courses that begin with a certain word. so .. all courses that begin
	// with A or all courses that begin with History ...
//	public List<Student> findByLastNameStartsWith(String lastname) {
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		String hql = "SELECT s FROM Student s where s.lastname like :lastname";
//
//		TypedQuery<Student> query = session.createQuery(hql, Student.class);
//		query.setParameter("lastname", lastname + "%");
//
//		List<Student> result = query.getResultList();
//
//		t.commit();
//		factory.close();
//		session.close();
//
//		return result;
//	}
//
//	public void insert(Student student) {
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		session.save(student);
//
//		t.commit();
//		factory.close();
//		session.close();
//	}
//
//	public void update(Student order) {
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
//
//		session.merge(order);
//
//		t.commit();
//		factory.close();
//		session.close();
	}

