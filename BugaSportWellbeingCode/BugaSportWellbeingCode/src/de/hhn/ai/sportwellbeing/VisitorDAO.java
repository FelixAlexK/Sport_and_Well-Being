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

public class VisitorDAO {
	public static Visitor loadVisitorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadVisitorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor getVisitorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getVisitorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor loadVisitorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadVisitorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor getVisitorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getVisitorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor loadVisitorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Visitor) session.load(de.hhn.ai.sportwellbeing.Visitor.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor getVisitorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Visitor) session.get(de.hhn.ai.sportwellbeing.Visitor.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor loadVisitorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Visitor) session.load(de.hhn.ai.sportwellbeing.Visitor.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor getVisitorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Visitor) session.get(de.hhn.ai.sportwellbeing.Visitor.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisitor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryVisitor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisitor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryVisitor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor[] listVisitorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listVisitorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor[] listVisitorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listVisitorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisitor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Visitor as Visitor");
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
	
	public static List queryVisitor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Visitor as Visitor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Visitor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor[] listVisitorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVisitor(session, condition, orderBy);
			return (Visitor[]) list.toArray(new Visitor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor[] listVisitorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVisitor(session, condition, orderBy, lockMode);
			return (Visitor[]) list.toArray(new Visitor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor loadVisitorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadVisitorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor loadVisitorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadVisitorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor loadVisitorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Visitor[] visitors = listVisitorByQuery(session, condition, orderBy);
		if (visitors != null && visitors.length > 0)
			return visitors[0];
		else
			return null;
	}
	
	public static Visitor loadVisitorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Visitor[] visitors = listVisitorByQuery(session, condition, orderBy, lockMode);
		if (visitors != null && visitors.length > 0)
			return visitors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVisitorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iterateVisitorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisitorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iterateVisitorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisitorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Visitor as Visitor");
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
	
	public static java.util.Iterator iterateVisitorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Visitor as Visitor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Visitor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visitor createVisitor() {
		return new de.hhn.ai.sportwellbeing.Visitor();
	}
	
	public static boolean save(de.hhn.ai.sportwellbeing.Visitor visitor) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().saveObject(visitor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.sportwellbeing.Visitor visitor) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().deleteObject(visitor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.Visitor visitor)throws PersistentException {
		try {
			de.hhn.ai.sportwellbeing.Event[] lVisiteds = visitor.visited.toArray();
			for(int i = 0; i < lVisiteds.length; i++) {
				lVisiteds[i].setVisitors(null);
			}
			de.hhn.ai.sportwellbeing.Event[] lBookedEventss = visitor.bookedEvents.toArray();
			for(int i = 0; i < lBookedEventss.length; i++) {
				lBookedEventss[i].visitor.remove(visitor);
			}
			de.hhn.ai.sportwellbeing.Event[] lEvents = visitor.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].animator.remove(visitor);
			}
			return delete(visitor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.Visitor visitor, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.sportwellbeing.Event[] lVisiteds = visitor.visited.toArray();
			for(int i = 0; i < lVisiteds.length; i++) {
				lVisiteds[i].setVisitors(null);
			}
			de.hhn.ai.sportwellbeing.Event[] lBookedEventss = visitor.bookedEvents.toArray();
			for(int i = 0; i < lBookedEventss.length; i++) {
				lBookedEventss[i].visitor.remove(visitor);
			}
			de.hhn.ai.sportwellbeing.Event[] lEvents = visitor.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].animator.remove(visitor);
			}
			try {
				session.delete(visitor);
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
	
	public static boolean refresh(de.hhn.ai.sportwellbeing.Visitor visitor) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().refresh(visitor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.sportwellbeing.Visitor visitor) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().evict(visitor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
