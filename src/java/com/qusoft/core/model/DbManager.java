/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qusoft.core.model;

import java.util.Properties;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author admin
 */
public class DbManager {
	private static SessionFactory sessionFactory;
	private static boolean CREATE = true;
	private static String FILE_CONFIG="/com/qusoft/core/model/_hibernate.cfg.xml";

	final public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure(FILE_CONFIG).buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void main(String[] a) {
		testHibernateBean();
		System.exit(0);
	}

	private static void testHibernateBean(){
		verificaDb();
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query1 = session.createQuery("from Utente");
		try {
			query1.list();
		} catch (Exception e) {
		}
		Query query2 = session.createQuery("from Profilo");
		try {
			query2.list();
		} catch (Exception e) {
		}
		Query query3 = session.createQuery("from UtenteProfilo");
		try {
			query3.list();
		} catch (Exception e) {
		}
		session.getTransaction().commit();

	}
	
	private static void verificaDb(){
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createSQLQuery("select count(*) from PROFILO");
		try {
			query.list();
		} catch (Exception e) {
			e.printStackTrace();
			initDbData();
		}
		session.getTransaction().commit();
	}

	private static void initDbData(){
		if (CREATE) {
			final Properties hibernateProperties = new Properties();
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create");
			final SessionFactory sessionFactory = new Configuration().configure(FILE_CONFIG).setProperties(hibernateProperties).buildSessionFactory();
			final Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			/** Init dati UTENTE **/
			Utente u = new Utente();
			u.setCodice("admin");
			u.setPassword("admin");
			u.setNome("admin");
			u.setCognome("admin");
			session.save(u);
			u = new Utente();
			u.setCodice("user");
			u.setPassword("user");
			u.setNome("user");
			u.setCognome("user");
			session.save(u);
			u = new Utente();
			u.setCodice("manager");
			u.setPassword("manager");
			u.setNome("manager");
			u.setCognome("manager");
			session.save(u);
			/** Init dati PROFILO **/
			Profilo p = new Profilo();
			p.setCodice("admin");
			p.setDescrizione("Amministratore");
			session.save(p);
			p = new Profilo();
			p.setCodice("user");
			p.setDescrizione("Utente");
			session.save(p);
			p = new Profilo();
			p.setCodice("manager");
			p.setDescrizione("Manager");
			session.save(p);
			/** Init dati UTENTE_PROFILO **/
			UtenteProfilo up = new UtenteProfilo();
			up.setCodiceUtente("admin");
			up.setCodiceProfilo("admin");
			session.save(up);
			up = new UtenteProfilo();
			up.setCodiceUtente("user");
			up.setCodiceProfilo("user");
			session.save(up);
			up = new UtenteProfilo();
			up.setCodiceUtente("manager");
			up.setCodiceProfilo("manager");
			session.save(up);
			session.getTransaction().commit();
		}
	}
}
