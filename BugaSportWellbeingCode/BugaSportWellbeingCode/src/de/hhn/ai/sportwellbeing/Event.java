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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Event")
public class Event implements Serializable {
	public Event() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EVENT_ANIMATOR) {
			return ORM_animator;
		}
		else if (key == ORMConstants.KEY_EVENT_ANIMATORS) {
			return ORM_animators;
		}
		else if (key == ORMConstants.KEY_EVENT_VISITOR) {
			return ORM_visitor;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENT_EVENTPROVIDER) {
			this.eventProvider = (de.hhn.ai.sportwellbeing.EventProvider) owner;
		}
		
		else if (key == ORMConstants.KEY_EVENT_VENUE) {
			this.venue = (de.hhn.ai.sportwellbeing.Place) owner;
		}
		
		else if (key == ORMConstants.KEY_EVENT_VISITORS) {
			this.visitors = (de.hhn.ai.sportwellbeing.Visitor) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_SPORTWELLBEING_EVENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_SPORTWELLBEING_EVENT_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=de.hhn.ai.sportwellbeing.Visitor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PersonID2", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="visits3"))
	private de.hhn.ai.sportwellbeing.Visitor visitors;
	
	@ManyToOne(targetEntity=de.hhn.ai.sportwellbeing.Place.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PlaceID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="takes place in"))
	private de.hhn.ai.sportwellbeing.Place venue;
	
	@ManyToOne(targetEntity=de.hhn.ai.sportwellbeing.EventProvider.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PersonID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="hosts"))
	private de.hhn.ai.sportwellbeing.EventProvider eventProvider;
	
	@Column(name="EventName", nullable=true, length=255)	
	private String eventName;
	
	@Column(name="Time", nullable=true)	
	private java.sql.Time time;
	
	@Column(name="NumberOfRegistrations", nullable=false, length=10)	
	private int numberOfRegistrations;
	
	@Column(name="MaximumParticipants", nullable=false, length=10)	
	private int maximumParticipants;
	
	@Column(name="FreePlaces", nullable=false, length=10)	
	private int freePlaces;
	
	@Column(name="`Date`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date date;
	
	@ElementCollection	
	@CollectionTable(name="Event_prices", joinColumns={ @JoinColumn(name="EventID") })	
	@org.hibernate.annotations.IndexColumn(name="EventIndex")	
	@Column(name="Prices", nullable=false)	
	private float[] prices;
	
	@ManyToMany(targetEntity=de.hhn.ai.sportwellbeing.Person.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Person_Event", joinColumns={ @JoinColumn(name="EventID") }, inverseJoinColumns={ @JoinColumn(name="PersonID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_animator = new java.util.HashSet();
	
	@ManyToMany(targetEntity=de.hhn.ai.sportwellbeing.Animator.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Person_Event2", joinColumns={ @JoinColumn(name="EventID") }, inverseJoinColumns={ @JoinColumn(name="PersonID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_animators = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_bookedEvents", targetEntity=de.hhn.ai.sportwellbeing.Person.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_visitor = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setEventName(String value) {
		this.eventName = value;
	}
	
	public String getEventName() {
		return eventName;
	}
	
	public void setTime(java.sql.Time value) {
		this.time = value;
	}
	
	public java.sql.Time getTime() {
		return time;
	}
	
	public void setPrices(float[] value) {
		this.prices = value;
	}
	
	public float[] getPrices() {
		return prices;
	}
	
	public void setNumberOfRegistrations(int value) {
		this.numberOfRegistrations = value;
	}
	
	public int getNumberOfRegistrations() {
		return numberOfRegistrations;
	}
	
	public void setMaximumParticipants(int value) {
		this.maximumParticipants = value;
	}
	
	public int getMaximumParticipants() {
		return maximumParticipants;
	}
	
	public void setFreePlaces(int value) {
		this.freePlaces = value;
	}
	
	public int getFreePlaces() {
		return freePlaces;
	}
	
	public void setDate(java.util.Date value) {
		this.date = value;
	}
	
	public java.util.Date getDate() {
		return date;
	}
	
	public void setEventProvider(de.hhn.ai.sportwellbeing.EventProvider value) {
		if (eventProvider != null) {
			eventProvider.provided.remove(this);
		}
		if (value != null) {
			value.provided.add(this);
		}
	}
	
	public de.hhn.ai.sportwellbeing.EventProvider getEventProvider() {
		return eventProvider;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EventProvider(de.hhn.ai.sportwellbeing.EventProvider value) {
		this.eventProvider = value;
	}
	
	private de.hhn.ai.sportwellbeing.EventProvider getORM_EventProvider() {
		return eventProvider;
	}
	
	private void setORM_Animator(java.util.Set value) {
		this.ORM_animator = value;
	}
	
	private java.util.Set getORM_Animator() {
		return ORM_animator;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.PersonSetCollection animator = new de.hhn.ai.sportwellbeing.PersonSetCollection(this, _ormAdapter, ORMConstants.KEY_EVENT_ANIMATOR, ORMConstants.KEY_PERSON_EVENT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setVenue(de.hhn.ai.sportwellbeing.Place value) {
		if (venue != null) {
			venue.event.remove(this);
		}
		if (value != null) {
			value.event.add(this);
		}
	}
	
	public de.hhn.ai.sportwellbeing.Place getVenue() {
		return venue;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Venue(de.hhn.ai.sportwellbeing.Place value) {
		this.venue = value;
	}
	
	private de.hhn.ai.sportwellbeing.Place getORM_Venue() {
		return venue;
	}
	
	public void setVisitors(de.hhn.ai.sportwellbeing.Visitor value) {
		if (visitors != null) {
			visitors.visited.remove(this);
		}
		if (value != null) {
			value.visited.add(this);
		}
	}
	
	public de.hhn.ai.sportwellbeing.Visitor getVisitors() {
		return visitors;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Visitors(de.hhn.ai.sportwellbeing.Visitor value) {
		this.visitors = value;
	}
	
	private de.hhn.ai.sportwellbeing.Visitor getORM_Visitors() {
		return visitors;
	}
	
	private void setORM_Animators(java.util.Set value) {
		this.ORM_animators = value;
	}
	
	private java.util.Set getORM_Animators() {
		return ORM_animators;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.AnimatorSetCollection animators = new de.hhn.ai.sportwellbeing.AnimatorSetCollection(this, _ormAdapter, ORMConstants.KEY_EVENT_ANIMATORS, ORMConstants.KEY_ANIMATOR_PERFORMANCES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Visitor(java.util.Set value) {
		this.ORM_visitor = value;
	}
	
	private java.util.Set getORM_Visitor() {
		return ORM_visitor;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.PersonSetCollection visitor = new de.hhn.ai.sportwellbeing.PersonSetCollection(this, _ormAdapter, ORMConstants.KEY_EVENT_VISITOR, ORMConstants.KEY_PERSON_BOOKEDEVENTS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
