package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Dao {

	public void saveUser(Users user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public boolean validate(String username, String password) {
			Transaction transaction = null;
			Users u = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				u = (Users) session.createQuery("FROM Users U WHERE U.username = :username")
						.setParameter("username", username).uniqueResult();

				if (u != null && u.getPassword().equals(password)) {
					return true;
				}
				transaction.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return false;
	}


}
