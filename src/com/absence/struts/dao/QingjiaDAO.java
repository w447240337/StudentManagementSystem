package com.absence.struts.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.absence.hibernate.beans.Application;
import com.absence.hibernate.beans.Examine;
import com.absence.hibernate.beans.Student;
import com.absence.hibernate.util.HibernateSessionFactory;

public class QingjiaDAO {
	public ArrayList<Application> search(String id) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		ArrayList<Application> list = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			Query query = null;
			query = session.createQuery("from Application where xuehao=?");
			query.setString(0, id.trim());
			System.out.println(query);
			list = (ArrayList<Application>) query.list();
			System.out.println(list);
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
		return list;
	}

	public Application Update(int id) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		Application user = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			Query query = null;
			query = session.createQuery("from Application where id=?");
			query.setInteger(0, id);
			System.out.println(id);
			System.out.println(query);
			System.out.println(query.uniqueResult());
			user = (Application) query.uniqueResult();
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

	public void Delect(int id) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			Query query = null;
			query = session.createQuery("from Examine where id=?");
			query.setInteger(0, id);
			System.out.println(query);
			System.out.println(query.uniqueResult());
			Examine exam = (Examine) query.uniqueResult();
			session.delete(exam);
			session.flush();
			query = session.createQuery("from Application where id=?");
			query.setInteger(0, id);
			System.out.println(query);
			System.out.println(query.uniqueResult());
			Application user = (Application) query.uniqueResult();
			session.delete(user);
			session.flush();
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
	}

	// 保存更新后的数据
	public boolean Save(int id, String name, String teachclass, String begintime, String overtime, String reason)
			throws HibernateException {
		Session session = null;
		Transaction tx = null;
		boolean b = true;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			Query query = null;
			query = session.createQuery("from Application where id=?");
			query.setInteger(0, id);
			System.out.println(query);
			System.out.println(query.uniqueResult());
			Application user = (Application) query.uniqueResult();
			user.setTeachclass(teachclass);
			user.setBegintime(begintime);
			user.setOvertime(overtime);
			user.setReason(reason);
			session.save(user);
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

	public Student Select(String xuehao) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		Student user = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			System.out.println(xuehao + "-----" + xuehao.trim() + "---");
			Query query = null;
			query = session.createQuery("from Student where id=?");
			query.setString(0, xuehao.trim());
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

	public Examine Select_P(int id) throws HibernateException {
		Session session = null;
		Transaction tx = null;
		Examine user = null;
		try {
			session = HibernateSessionFactory.getSession();
			tx = session.beginTransaction();
			System.out.println(id + "--------");
			Query query = null;
			query = session.createQuery("from Examine where id=?");
			query.setInteger(0, id);
			System.out.println(query);
			System.out.println(query.uniqueResult());
			user = (Examine) query.uniqueResult();
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
}
