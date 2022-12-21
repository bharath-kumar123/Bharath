package com.bharath.spring.repository;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bharath.spring.entity.Register;

@Repository
public class RegisterRepository {
	@Autowired
	private SessionFactory sessionFactory;
	public void save(Register register)
	{
		Session session = sessionFactory.openSession();
		try {
			Transaction transaction = session.beginTransaction();
			session.merge(register);
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
		
		
	}
	public List<Register> findAll()
	{
		Session session=sessionFactory.openSession();
		try {
			String hql="from Register";
			org.hibernate.query.Query query = session.createQuery(hql);
			return query.list();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			session.close();
		}
		return Collections.EMPTY_LIST;
	}
	public Register findByName(String name)
	{
		Session session=sessionFactory.openSession();
		try {
			String hql="from Register where name=:n";
			org.hibernate.query.Query query=session.createQuery(hql);
			query.setParameter("n", name);
			return (Register)query.uniqueResult();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
		return null;
	}
}
