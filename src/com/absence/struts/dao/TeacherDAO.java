package com.absence.struts.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.absence.hibernate.beans.Application;
import com.absence.hibernate.beans.Examine;
import com.absence.hibernate.util.HibernateSessionFactory;

public class TeacherDAO {
	public ArrayList<Examine> Check_E()throws HibernateException{
	    Session session=null;
	    Transaction tx=null;
	    ArrayList<Examine> list=null;
	    try{
	    	session=HibernateSessionFactory.getSession();
	    	tx=session.beginTransaction();  
	    	Query query=null;
	        query=session.createQuery("from Examine where permit='Œ¥…Û∫À'");
	    	System.out.println(query);
	    	list=(ArrayList<Examine>)query.list();
	    	query=null;
	    	tx.commit();
	    	tx=null;
	    }catch(HibernateException e){
	    	throw e;
	    }finally{
	    	if(tx!=null){
	    		tx.rollback();
	    	}
	    	HibernateSessionFactory.closeSession();
	    }
	    return list;
	  }
	
	public ArrayList<Examine> Check_O()throws HibernateException{
	    Session session=null;
	    Transaction tx=null;
	    ArrayList<Examine> list=null;
	    try{
	    	session=HibernateSessionFactory.getSession();
	    	tx=session.beginTransaction();  
	    	Query query=null;
	        query=session.createQuery("from Examine where permit='“—…Û∫À'");
	    	System.out.println(query);
	    	list=(ArrayList<Examine>)query.list();
	    	query=null;
	    	tx.commit();
	    	tx=null;
	    }catch(HibernateException e){
	    	throw e;
	    }finally{
	    	if(tx!=null){
	    		tx.rollback();
	    	}
	    	HibernateSessionFactory.closeSession();
	    }
	    return list;
	  }
	public boolean SaveShenhe(int id,String account)throws HibernateException{
		  Session session =null;
		  Transaction tx=null;
		  boolean b=true;
		  try{
			  session=HibernateSessionFactory.getSession();
			  tx=session.beginTransaction();
			  Query query=null;
		      query=session.createQuery("from Examine where id=?");
		      query.setInteger(0, id);
		      System.out.println(query);
		      System.out.println(query.uniqueResult());
		      SimpleDateFormat dateformat=new SimpleDateFormat("yyyy.MM.dd");
			  String time=dateformat.format(new Date());
		      Examine user=(Examine)query.uniqueResult();
			  user.setPermit("“—…Û∫À");
			  user.setExamtime(time);
			  user.setAdminid(account);
			  session.save(user);
			  tx.commit();
			  tx=null;
		  }catch(HibernateException e){
			  b=false;
			  throw e;
		      }finally{if(tx!=null){tx.rollback();}
		      HibernateSessionFactory.closeSession();
		      }
		  return b;
		  
		  }
	
	public void Delect(int id)throws HibernateException{
		  Session session=null;
		  Transaction tx=null;
		  try{
			  session=HibernateSessionFactory.getSession();
			  tx=session.beginTransaction();
			  Query query=null;		  
			  query=session.createQuery("from Examine where id=?");
		      query.setInteger(0, id);
		      System.out.println(query);
		      System.out.println(query.uniqueResult());
		      Examine exam=(Examine)query.uniqueResult();
			  session.delete(exam);
			  session.flush();
			  query=session.createQuery("from Application where id=?");
		      query.setInteger(0, id);
		      System.out.println(query);
		      System.out.println(query.uniqueResult());
		      Application user=(Application)query.uniqueResult();
			  session.delete(user);
			  session.flush();
			  tx.commit();
			  tx=null;
		  }catch(HibernateException e){
			  throw e;
			  
		  }finally{
			  if(tx!=null){tx.rollback();
		      }
		     HibernateSessionFactory.closeSession();
	     }
	  }
}
