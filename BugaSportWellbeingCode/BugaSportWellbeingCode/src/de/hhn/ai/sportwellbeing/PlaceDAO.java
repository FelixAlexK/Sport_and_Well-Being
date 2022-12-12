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

public class PlaceDAO {
	public static Place loadPlaceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadPlaceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place getPlaceByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getPlaceByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place loadPlaceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadPlaceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place getPlaceByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getPlaceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place loadPlaceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Place) session.load(de.hhn.ai.sportwellbeing.Place.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place getPlaceByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Place) session.get(de.hhn.ai.sportwellbeing.Place.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place loadPlaceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Place) session.load(de.hhn.ai.sportwellbeing.Place.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place getPlaceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Place) session.get(de.hhn.ai.sportwellbeing.Place.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlace(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryPlace(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlace(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryPlace(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place[] listPlaceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listPlaceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place[] listPlaceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listPlaceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPlace(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Place as Place");
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
	
	public static List queryPlace(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Place as Place");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Place", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place[] listPlaceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPlace(session, condition, orderBy);
			return (Place[]) list.toArray(new Place[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place[] listPlaceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPlace(session, condition, orderBy, lockMode);
			return (Place[]) list.toArray(new Place[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place loadPlaceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadPlaceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place loadPlaceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadPlaceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place loadPlaceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Place[] places = listPlaceByQuery(session, condition, orderBy);
		if (places != null && places.length > 0)
			return places[0];
		else
			return null;
	}
	
	public static Place loadPlaceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Place[] places = listPlaceByQuery(session, condition, orderBy, lockMode);
		if (places != null && places.length > 0)
			return places[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePlaceByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iteratePlaceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlaceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iteratePlaceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePlaceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Place as Place");
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
	
	public static java.util.Iterator iteratePlaceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Place as Place");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Place", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Place createPlace() {
		return new de.hhn.ai.sportwellbeing.Place();
	}
	
	public static boolean save(de.hhn.ai.sportwellbeing.Place place) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().saveObject(place);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.sportwellbeing.Place place) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().deleteObject(place);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.Place place)throws PersistentException {
		try {
			de.hhn.ai.sportwellbeing.Event[] lEvents = place.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].setVenue(null);
			}
			return delete(place);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.Place place, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.sportwellbeing.Event[] lEvents = place.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].setVenue(null);
			}
			try {
				session.delete(place);
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
	
	public static boolean refresh(de.hhn.ai.sportwellbeing.Place place) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().refresh(place);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.sportwellbeing.Place place) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().evict(place);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
