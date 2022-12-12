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

public class AnimatorDAO {
	public static Animator loadAnimatorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadAnimatorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator getAnimatorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getAnimatorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator loadAnimatorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadAnimatorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator getAnimatorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return getAnimatorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator loadAnimatorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Animator) session.load(de.hhn.ai.sportwellbeing.Animator.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator getAnimatorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Animator) session.get(de.hhn.ai.sportwellbeing.Animator.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator loadAnimatorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Animator) session.load(de.hhn.ai.sportwellbeing.Animator.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator getAnimatorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Animator) session.get(de.hhn.ai.sportwellbeing.Animator.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimator(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryAnimator(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimator(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return queryAnimator(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator[] listAnimatorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listAnimatorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator[] listAnimatorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return listAnimatorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAnimator(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Animator as Animator");
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
	
	public static List queryAnimator(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Animator as Animator");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Animator", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator[] listAnimatorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAnimator(session, condition, orderBy);
			return (Animator[]) list.toArray(new Animator[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator[] listAnimatorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAnimator(session, condition, orderBy, lockMode);
			return (Animator[]) list.toArray(new Animator[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator loadAnimatorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadAnimatorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator loadAnimatorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return loadAnimatorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator loadAnimatorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Animator[] animators = listAnimatorByQuery(session, condition, orderBy);
		if (animators != null && animators.length > 0)
			return animators[0];
		else
			return null;
	}
	
	public static Animator loadAnimatorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Animator[] animators = listAnimatorByQuery(session, condition, orderBy, lockMode);
		if (animators != null && animators.length > 0)
			return animators[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnimatorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iterateAnimatorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnimatorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = KlassendiagrammPMTPersistentManager.instance().getSession();
			return iterateAnimatorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAnimatorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Animator as Animator");
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
	
	public static java.util.Iterator iterateAnimatorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.sportwellbeing.Animator as Animator");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Animator", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Animator createAnimator() {
		return new de.hhn.ai.sportwellbeing.Animator();
	}
	
	public static boolean save(de.hhn.ai.sportwellbeing.Animator animator) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().saveObject(animator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.sportwellbeing.Animator animator) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().deleteObject(animator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.Animator animator)throws PersistentException {
		try {
			de.hhn.ai.sportwellbeing.Event[] lPerformancess = animator.performances.toArray();
			for(int i = 0; i < lPerformancess.length; i++) {
				lPerformancess[i].animators.remove(animator);
			}
			de.hhn.ai.sportwellbeing.Event[] lBookedEventss = animator.bookedEvents.toArray();
			for(int i = 0; i < lBookedEventss.length; i++) {
				lBookedEventss[i].visitor.remove(animator);
			}
			de.hhn.ai.sportwellbeing.Event[] lEvents = animator.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].animator.remove(animator);
			}
			return delete(animator);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.sportwellbeing.Animator animator, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.sportwellbeing.Event[] lPerformancess = animator.performances.toArray();
			for(int i = 0; i < lPerformancess.length; i++) {
				lPerformancess[i].animators.remove(animator);
			}
			de.hhn.ai.sportwellbeing.Event[] lBookedEventss = animator.bookedEvents.toArray();
			for(int i = 0; i < lBookedEventss.length; i++) {
				lBookedEventss[i].visitor.remove(animator);
			}
			de.hhn.ai.sportwellbeing.Event[] lEvents = animator.event.toArray();
			for(int i = 0; i < lEvents.length; i++) {
				lEvents[i].animator.remove(animator);
			}
			try {
				session.delete(animator);
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
	
	public static boolean refresh(de.hhn.ai.sportwellbeing.Animator animator) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().refresh(animator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.sportwellbeing.Animator animator) throws PersistentException {
		try {
			KlassendiagrammPMTPersistentManager.instance().getSession().evict(animator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
