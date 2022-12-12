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

public class EventProviderDAO {
	public static EventProvider loadEventProviderByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadEventProviderByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider getEventProviderByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getEventProviderByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider loadEventProviderByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadEventProviderByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider getEventProviderByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getEventProviderByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider loadEventProviderByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventProvider) session.load(de.hhn.ai.sportwellbeing.EventProvider.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider getEventProviderByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventProvider) session.get(de.hhn.ai.sportwellbeing.EventProvider.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider loadEventProviderByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventProvider) session.load(de.hhn.ai.sportwellbeing.EventProvider.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider getEventProviderByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventProvider) session.get(de.hhn.ai.sportwellbeing.EventProvider.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventProvider(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryEventProvider(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventProvider(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryEventProvider(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider[] listEventProviderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listEventProviderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider[] listEventProviderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listEventProviderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventProvider(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.EventProvider as EventProvider");
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
	
	public static List queryEventProvider(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.EventProvider as EventProvider");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventProvider", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider[] listEventProviderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEventProvider(session, condition, orderBy);
			return (EventProvider[]) list.toArray(new EventProvider[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider[] listEventProviderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEventProvider(session, condition, orderBy, lockMode);
			return (EventProvider[]) list.toArray(new EventProvider[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider loadEventProviderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadEventProviderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider loadEventProviderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadEventProviderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider loadEventProviderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EventProvider[] eventProviders = listEventProviderByQuery(session, condition, orderBy);
		if (eventProviders != null && eventProviders.length > 0)
			return eventProviders[0];
		else
			return null;
	}
	
	public static EventProvider loadEventProviderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EventProvider[] eventProviders = listEventProviderByQuery(session, condition, orderBy, lockMode);
		if (eventProviders != null && eventProviders.length > 0)
			return eventProviders[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEventProviderByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iterateEventProviderByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventProviderByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iterateEventProviderByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventProviderByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.EventProvider as EventProvider");
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
	
	public static java.util.Iterator iterateEventProviderByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.EventProvider as EventProvider");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventProvider", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventProvider createEventProvider() {
		return new de.hhn.ai.sportwellbeing.EventProvider();
	}
	
	public static boolean save(de.hhn.ai.sportwellbeing.EventProvider eventProvider) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().saveObject(eventProvider);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.sportwellbeing.EventProvider eventProvider) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().deleteObject(eventProvider);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.EventProvider eventProvider)throws PersistentException {
		try {
			de.hhn.ai.sportwellbeing.Event[] lProvideds = eventProvider.provided.toArray();
			for(int i = 0; i < lProvideds.length; i++) {
				lProvideds[i].setEventProvider(null);
			}
			de.hhn.ai.sportwellbeing.Event[] lBookedEventss = eventProvider.bookedEvents.toArray();
			for(int i = 0; i < lBookedEventss.length; i++) {
				lBookedEventss[i].visitor.remove(eventProvider);
			}
			de.hhn.ai.sportwellbeing.Event[] lEvents = eventProvider.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].animator.remove(eventProvider);
			}
			return delete(eventProvider);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.EventProvider eventProvider, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.sportwellbeing.Event[] lProvideds = eventProvider.provided.toArray();
			for(int i = 0; i < lProvideds.length; i++) {
				lProvideds[i].setEventProvider(null);
			}
			de.hhn.ai.sportwellbeing.Event[] lBookedEventss = eventProvider.bookedEvents.toArray();
			for(int i = 0; i < lBookedEventss.length; i++) {
				lBookedEventss[i].visitor.remove(eventProvider);
			}
			de.hhn.ai.sportwellbeing.Event[] lEvents = eventProvider.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].animator.remove(eventProvider);
			}
			try {
				session.delete(eventProvider);
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
	
	public static boolean refresh(de.hhn.ai.sportwellbeing.EventProvider eventProvider) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().refresh(eventProvider);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.sportwellbeing.EventProvider eventProvider) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().evict(eventProvider);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
