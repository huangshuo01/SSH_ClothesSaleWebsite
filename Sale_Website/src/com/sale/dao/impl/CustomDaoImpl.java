package com.sale.dao.impl;

import java.util.List;  

import javax.annotation.Resource;

import com.sale.model.Custom;
import com.sale.model.Seller;
import com.sale.dao.CustomDao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomDaoImpl implements CustomDao  {
	@Resource
	private SessionFactory sessionFactory;
	
	public Custom findCustomById(String  Id) {
		Session session = null;
		List list=null;
		Custom custom = new Custom();
		String hql = "from Custom where customId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);			
			list = query.list();
			custom=(Custom)list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return custom;
	}
	
	public List checkCustomById(String  Id) {
		Session session = null;
		List list=null;
		Custom custom = new Custom();
		String hql = "from Custom where customId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}
	
	public List checkCustomByName(String Name){
		Session session = null;
		List list=null;
		Custom custom = new Custom();
		String hql = "from Custom where customName=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Name);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}
	
	public void updateCustom(Custom custom){
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.update(custom);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
}
