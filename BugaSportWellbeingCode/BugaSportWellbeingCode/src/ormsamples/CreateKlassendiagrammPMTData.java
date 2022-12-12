/**
 * Licensee: pgaug(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateKlassendiagrammPMTData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.ai.sportwellbeing.KlassendiagrammPMTPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.sportwellbeing.Person ldehhnaisportwellbeingPerson = de.hhn.ai.sportwellbeing.PersonDAO.createPerson();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : event, bookedEvents, age
			de.hhn.ai.sportwellbeing.PersonDAO.save(ldehhnaisportwellbeingPerson);
			de.hhn.ai.sportwellbeing.Event ldehhnaisportwellbeingEvent = de.hhn.ai.sportwellbeing.EventDAO.createEvent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : visitor, animators, animator, prices, freePlaces, maximumParticipants, numberOfRegistrations, eventProvider, venue, visitors
			de.hhn.ai.sportwellbeing.EventDAO.save(ldehhnaisportwellbeingEvent);
			de.hhn.ai.sportwellbeing.Animator ldehhnaisportwellbeingAnimator = de.hhn.ai.sportwellbeing.AnimatorDAO.createAnimator();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : performances
			de.hhn.ai.sportwellbeing.AnimatorDAO.save(ldehhnaisportwellbeingAnimator);
			de.hhn.ai.sportwellbeing.EventProvider ldehhnaisportwellbeingEventProvider = de.hhn.ai.sportwellbeing.EventProviderDAO.createEventProvider();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : provided
			de.hhn.ai.sportwellbeing.EventProviderDAO.save(ldehhnaisportwellbeingEventProvider);
			de.hhn.ai.sportwellbeing.Visitor ldehhnaisportwellbeingVisitor = de.hhn.ai.sportwellbeing.VisitorDAO.createVisitor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : visited
			de.hhn.ai.sportwellbeing.VisitorDAO.save(ldehhnaisportwellbeingVisitor);
			de.hhn.ai.sportwellbeing.Place ldehhnaisportwellbeingPlace = de.hhn.ai.sportwellbeing.PlaceDAO.createPlace();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : event, number, latitude, longitude
			de.hhn.ai.sportwellbeing.PlaceDAO.save(ldehhnaisportwellbeingPlace);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateKlassendiagrammPMTData createKlassendiagrammPMTData = new CreateKlassendiagrammPMTData();
			try {
				createKlassendiagrammPMTData.createTestData();
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
