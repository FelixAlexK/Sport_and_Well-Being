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
@DiscriminatorValue("Animator")
public class Animator extends de.hhn.ai.sportwellbeing.Person implements Serializable {
	public Animator() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ANIMATOR_PERFORMANCES) {
			return ORM_performances;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NumberOfPerformances", nullable=true, length=10)	
	private int numberOfPerformances;
	
	@Column(name="Salary", nullable=true)	
	private float salary;
	
	@ManyToMany(mappedBy="ORM_animators", targetEntity=de.hhn.ai.sportwellbeing.Event.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_performances = new java.util.HashSet();
	
	public void setNumberOfPerformances(int value) {
		this.numberOfPerformances = value;
	}
	
	public int getNumberOfPerformances() {
		return numberOfPerformances;
	}
	
	public void setSalary(float value) {
		this.salary = value;
	}
	
	public float getSalary() {
		return salary;
	}
	
	private void setORM_Performances(java.util.Set value) {
		this.ORM_performances = value;
	}
	
	private java.util.Set getORM_Performances() {
		return ORM_performances;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.EventSetCollection performances = new de.hhn.ai.sportwellbeing.EventSetCollection(this, _ormAdapter, ORMConstants.KEY_ANIMATOR_PERFORMANCES, ORMConstants.KEY_EVENT_ANIMATORS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
