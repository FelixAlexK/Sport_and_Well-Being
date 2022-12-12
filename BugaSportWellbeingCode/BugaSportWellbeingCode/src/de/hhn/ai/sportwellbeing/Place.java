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
import java.util.ArrayList;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Place")
public class Place implements Serializable {
	public Place() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PLACE_EVENT) {
			return ORM_event;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_SPORTWELLBEING_PLACE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_SPORTWELLBEING_PLACE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Longitude", nullable=false)	
	private double longitude;
	
	@Column(name="Latitude", nullable=false)	
	private double latitude;
	
	@Column(name="Number", nullable=false, length=10)	
	private int number;
	
	@Column(name="Events", nullable=true, length=10)	
	private ArrayList<Event> events = new ArrayList<>();
	
	@OneToMany(mappedBy="venue", targetEntity=de.hhn.ai.sportwellbeing.Event.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_event = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setLongitude(double value) {
		this.longitude = value;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLatitude(double value) {
		this.latitude = value;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setNumber(int value) {
		this.number = value;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setEvents(int value) {
		setEvents(Integer.valueOf(value));
	}
	
	public void setEvents(ArrayList<Event> value) {
		this.events = value;
	}
	
	public ArrayList<Event> getEvents() {
		return events;
	}
	
	private void setORM_Event(java.util.Set value) {
		this.ORM_event = value;
	}
	
	private java.util.Set getORM_Event() {
		return ORM_event;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.EventSetCollection event = new de.hhn.ai.sportwellbeing.EventSetCollection(this, _ormAdapter, ORMConstants.KEY_PLACE_EVENT, ORMConstants.KEY_EVENT_VENUE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
