/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: pgaug(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.ai.sportwellbeing;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PersonDAO {
	public static Person loadPersonByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadPersonByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person getPersonByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getPersonByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person loadPersonByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadPersonByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person getPersonByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getPersonByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person loadPersonByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Person) session.load(de.hhn.ai.sportwellbeing.Person.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person getPersonByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Person) session.get(de.hhn.ai.sportwellbeing.Person.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person loadPersonByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Person) session.load(de.hhn.ai.sportwellbeing.Person.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person getPersonByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Person) session.get(de.hhn.ai.sportwellbeing.Person.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPerson(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryPerson(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPerson(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryPerson(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person[] listPersonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listPersonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person[] listPersonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listPersonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPerson(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Person as Person");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPerson(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Person as Person");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Person", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person[] listPersonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPerson(session, condition, orderBy);
			return (Person[]) list.toArray(new Person[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person[] listPersonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPerson(session, condition, orderBy, lockMode);
			return (Person[]) list.toArray(new Person[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person loadPersonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadPersonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person loadPersonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadPersonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person loadPersonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Person[] persons = listPersonByQuery(session, condition, orderBy);
		if (persons != null && persons.length > 0)
			return persons[0];
		else
			return null;
	}
	
	public static Person loadPersonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Person[] persons = listPersonByQuery(session, condition, orderBy, lockMode);
		if (persons != null && persons.length > 0)
			return persons[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iteratePersonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iteratePersonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Person as Person");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Person as Person");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Person", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Person createPerson() {
		return new de.hhn.ai.sportwellbeing.Person();
	}
	
	public static boolean save(de.hhn.ai.sportwellbeing.Person person) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().saveObject(person);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.sportwellbeing.Person person) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().deleteObject(person);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.Person person)throws PersistentException {
		if (person instanceof de.hhn.ai.sportwellbeing.Animator) {
			return de.hhn.ai.sportwellbeing.AnimatorDAO.deleteAndDissociate((de.hhn.ai.sportwellbeing.Animator) person);
		}
		
		if (person instanceof de.hhn.ai.sportwellbeing.EventProvider) {
			return de.hhn.ai.sportwellbeing.EventProviderDAO.deleteAndDissociate((de.hhn.ai.sportwellbeing.EventProvider) person);
		}
		
		if (person instanceof de.hhn.ai.sportwellbeing.Visitor) {
			return de.hhn.ai.sportwellbeing.VisitorDAO.deleteAndDissociate((de.hhn.ai.sportwellbeing.Visitor) person);
		}
		
		try {
			de.hhn.ai.sportwellbeing.Event[] lBookedEventss = person.bookedEvents.toArray();
			for(int i = 0; i < lBookedEventss.length; i++) {
				lBookedEventss[i].visitor.remove(person);
			}
			de.hhn.ai.sportwellbeing.Event[] lEvents = person.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].animator.remove(person);
			}
			return delete(person);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.Person person, org.orm.PersistentSession session)throws PersistentException {
		if (person instanceof de.hhn.ai.sportwellbeing.Animator) {
			return de.hhn.ai.sportwellbeing.AnimatorDAO.deleteAndDissociate((de.hhn.ai.sportwellbeing.Animator) person, session);
		}
		
		if (person instanceof de.hhn.ai.sportwellbeing.EventProvider) {
			return de.hhn.ai.sportwellbeing.EventProviderDAO.deleteAndDissociate((de.hhn.ai.sportwellbeing.EventProvider) person, session);
		}
		
		if (person instanceof de.hhn.ai.sportwellbeing.Visitor) {
			return de.hhn.ai.sportwellbeing.VisitorDAO.deleteAndDissociate((de.hhn.ai.sportwellbeing.Visitor) person, session);
		}
		
		try {
			de.hhn.ai.sportwellbeing.Event[] lBookedEventss = person.bookedEvents.toArray();
			for(int i = 0; i < lBookedEventss.length; i++) {
				lBookedEventss[i].visitor.remove(person);
			}
			de.hhn.ai.sportwellbeing.Event[] lEvents = person.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].animator.remove(person);
			}
			try {
				session.delete(person);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.ai.sportwellbeing.Person person) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().refresh(person);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.sportwellbeing.Person person) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().evict(person);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
