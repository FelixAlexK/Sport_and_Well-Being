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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("EventProvider")
public class EventProvider extends de.hhn.ai.sportwellbeing.Person implements Serializable {
	public EventProvider() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EVENTPROVIDER_PROVIDED) {
			return ORM_provided;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Organization", nullable=true, length=255)	
	private String organization;
	
	@Column(name="Budget", nullable=true)	
	private float budget;
	
	@Column(name="Verified", nullable=true, length=1)	
	private boolean verified;
	
	@OneToMany(mappedBy="eventProvider", targetEntity=de.hhn.ai.sportwellbeing.Event.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_provided = new java.util.HashSet();
	
	public void setOrganization(String value) {
		this.organization = value;
	}
	
	public String getOrganization() {
		return organization;
	}
	
	public void setBudget(float value) {
		this.budget = value;
	}
	
	public float getBudget() {
		return budget;
	}
	
	public void setVerified(boolean value) {
		this.verified = value;
	}
	
	public boolean getVerified() {
		return verified;
	}
	
	private void setORM_Provided(java.util.Set value) {
		this.ORM_provided = value;
	}
	
	private java.util.Set getORM_Provided() {
		return ORM_provided;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.EventSetCollection provided = new de.hhn.ai.sportwellbeing.EventSetCollection(this, _ormAdapter, ORMConstants.KEY_EVENTPROVIDER_PROVIDED, ORMConstants.KEY_EVENT_EVENTPROVIDER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
