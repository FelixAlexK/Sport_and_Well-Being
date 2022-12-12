/**
 * Licensee: pgaug(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListKlassendiagrammPMTData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Person...");
		de.hhn.ai.sportwellbeing.Person[] dehhnaisportwellbeingPersons = de.hhn.ai.sportwellbeing.PersonDAO.listPersonByQuery(null, null);
		int length = Math.min(dehhnaisportwellbeingPersons.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaisportwellbeingPersons[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Event...");
		de.hhn.ai.sportwellbeing.Event[] dehhnaisportwellbeingEvents = de.hhn.ai.sportwellbeing.EventDAO.listEventByQuery(null, null);
		length = Math.min(dehhnaisportwellbeingEvents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaisportwellbeingEvents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Animator...");
		de.hhn.ai.sportwellbeing.Animator[] dehhnaisportwellbeingAnimators = de.hhn.ai.sportwellbeing.AnimatorDAO.listAnimatorByQuery(null, null);
		length = Math.min(dehhnaisportwellbeingAnimators.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaisportwellbeingAnimators[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EventProvider...");
		de.hhn.ai.sportwellbeing.EventProvider[] dehhnaisportwellbeingEventProviders = de.hhn.ai.sportwellbeing.EventProviderDAO.listEventProviderByQuery(null, null);
		length = Math.min(dehhnaisportwellbeingEventProviders.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaisportwellbeingEventProviders[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Visitor...");
		de.hhn.ai.sportwellbeing.Visitor[] dehhnaisportwellbeingVisitors = de.hhn.ai.sportwellbeing.VisitorDAO.listVisitorByQuery(null, null);
		length = Math.min(dehhnaisportwellbeingVisitors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaisportwellbeingVisitors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Place...");
		de.hhn.ai.sportwellbeing.Place[] dehhnaisportwellbeingPlaces = de.hhn.ai.sportwellbeing.PlaceDAO.listPlaceByQuery(null, null);
		length = Math.min(dehhnaisportwellbeingPlaces.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaisportwellbeingPlaces[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListKlassendiagrammPMTData listKlassendiagrammPMTData = new ListKlassendiagrammPMTData();
			try {
				listKlassendiagrammPMTData.listTestData();
			}
			finally {
				de.hhn.ai.sportwellbeing.KlassendiagrammPMTPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
