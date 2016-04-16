package com.absence.struts.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.absence.hibernate.beans.Application;
import com.absence.hibernate.beans.Examine;
import com.absence.hibernate.beans.Student;
import com.absence.hibernate.beans.Teacher;
import com.absence.hibernate.util.HibernateSessionFactory;

public class UserDAO {
	public Student valid_S(String id, String password) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		Student user = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			System.out.println(id + "-----" + id.trim() + "---" + password.trim());
			Query query = null;
			query = session.createQuery("from Student where id=? and password=?");
			query.setString(0, id.trim());
			query.setString(1, password.trim());
			System.out.println(query);
			System.out.println(query.uniqueResult());
			user = (Student) query.uniqueResult();
			query = null;
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			throw e;
		} finally {
			if (tx != null) {
				tx.rollback();
			}
			HibernateSessionFactory.closeSession();
		}
		return user;
	}

	public Teacher valid_T(String id, String password) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		Teacher user = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			System.out.println(id + "-----" + id.trim() + "---" + password.trim());
			Query query = null;
			query = session.createQuery("from Teacher where id=? and password=?");
			query.setString(0, id.trim());
			query.setString(1, password.trim());
			System.out.println(query);
			System.out.println("456");
			System.out.println(query.uniqueResult());
			user = (Teacher) query.uniqueResult();
			query = null;
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			throw e;
		} finally {
			if (tx != null) {
				tx.rollback();
			}
			HibernateSessionFactory.closeSession();
		}
		return user;
	}

	public String isName_S(String id) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		String b = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Student where id=?");
			query.setString(0, id.trim());
			Student user = (Student) query.uniqueResult();
			if (user != null)
				b = user.getName();
			query = null;
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			throw e;

		} finally {
			if (tx != null) {
				tx.rollback();
			}
			HibernateSessionFactory.closeSession();
		}
		return b;
	}

	public String isName_T(String id) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		String b = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Teacher where id=?");
			query.setString(0, id.trim());
			Teacher user = (Teacher) query.uniqueResult();
			if (user != null)
				b = user.getName();
			query = null;
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			throw e;

		} finally {
			if (tx != null) {
				tx.rollback();
			}
			HibernateSessionFactory.closeSession();
		}
		return b;
	}

	public boolean isExist(String id) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		boolean b = false;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from Student where id=?");
			query.setString(0, id.trim());
			Student user = (Student) query.uniqueResult();
			if (user != null)
				b = true;
			query = null;
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			throw e;

		} finally {
			if (tx != null) {
				tx.rollback();
			}
			HibernateSessionFactory.closeSession();
		}
		return b;
	}

	public boolean add(String id, String teachclass, String begintime, String overtime, String reason)
			throws HibernateException {
		Session session = null;
		Transaction tx = null;
		boolean b = true;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			Application user = new Application();
			Student stu = new Student();
			stu.setId(id);
			user.setStudent(stu);
			user.setTeachclass(teachclass);
			user.setBegintime(begintime);
			user.setOvertime(overtime);
			user.setReason(reason);
			session.save(user);
			System.out.println("eaxmine----" + user.getId());
			Examine exam = new Examine();
			exam.setId(user.getId());
			exam.setPermit("Œ¥…Û∫À");
			session.save(exam);
			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			b = false;
			throw e;
		} finally {
			if (tx != null) {
				tx.rollback();
			}
			HibernateSessionFactory.closeSession();
		}
		return b;

	}
}
