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
@Table(name="Person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Person")
public class Person implements Serializable {
	public Person() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PERSON_BOOKEDEVENTS) {
			return ORM_bookedEvents;
		}
		else if (key == ORMConstants.KEY_PERSON_EVENT) {
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
	@GeneratedValue(generator="DE_HHN_AI_SPORTWELLBEING_PERSON_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_SPORTWELLBEING_PERSON_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Name", nullable=true, length=255)	
	protected String name;
	
	@Column(name="Age", nullable=false, length=10)	
	protected int age;
	
	@Column(name="Email", nullable=true, length=255)	
	protected String email;
	
	@ManyToMany(targetEntity=de.hhn.ai.sportwellbeing.Event.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Event_Person", joinColumns={ @JoinColumn(name="PersonID") }, inverseJoinColumns={ @JoinColumn(name="EventID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_bookedEvents = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_animator", targetEntity=de.hhn.ai.sportwellbeing.Event.class)	
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
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int value) {
		this.age = value;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setORM_BookedEvents(java.util.Set value) {
		this.ORM_bookedEvents = value;
	}
	
	private java.util.Set getORM_BookedEvents() {
		return ORM_bookedEvents;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.EventSetCollection bookedEvents = new de.hhn.ai.sportwellbeing.EventSetCollection(this, _ormAdapter, ORMConstants.KEY_PERSON_BOOKEDEVENTS, ORMConstants.KEY_EVENT_VISITOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Event(java.util.Set value) {
		this.ORM_event = value;
	}
	
	private java.util.Set getORM_Event() {
		return ORM_event;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.EventSetCollection event = new de.hhn.ai.sportwellbeing.EventSetCollection(this, _ormAdapter, ORMConstants.KEY_PERSON_EVENT, ORMConstants.KEY_EVENT_ANIMATOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
