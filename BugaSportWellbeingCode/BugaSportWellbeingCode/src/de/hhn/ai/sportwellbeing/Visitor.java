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
@DiscriminatorValue("Visitor")
public class Visitor extends de.hhn.ai.sportwellbeing.Person implements Serializable {
	public Visitor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_VISITOR_VISITED) {
			return ORM_visited;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="visitors", targetEntity=de.hhn.ai.sportwellbeing.Event.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_visited = new java.util.HashSet();
	
	private void setORM_Visited(java.util.Set value) {
		this.ORM_visited = value;
	}
	
	private java.util.Set getORM_Visited() {
		return ORM_visited;
	}
	
	@Transient	
	public final de.hhn.ai.sportwellbeing.EventSetCollection visited = new de.hhn.ai.sportwellbeing.EventSetCollection(this, _ormAdapter, ORMConstants.KEY_VISITOR_VISITED, ORMConstants.KEY_EVENT_VISITORS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
