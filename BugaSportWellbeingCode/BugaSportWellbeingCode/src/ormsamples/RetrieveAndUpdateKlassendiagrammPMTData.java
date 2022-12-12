/**
 * Licensee: pgaug(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateKlassendiagrammPMTData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.ai.sportwellbeing.KlassendiagrammPMTPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.sportwellbeing.Person ldehhnaisportwellbeingPerson = de.hhn.ai.sportwellbeing.PersonDAO.loadPersonByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.sportwellbeing.PersonDAO.save(ldehhnaisportwellbeingPerson);
			de.hhn.ai.sportwellbeing.Event ldehhnaisportwellbeingEvent = de.hhn.ai.sportwellbeing.EventDAO.loadEventByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.sportwellbeing.EventDAO.save(ldehhnaisportwellbeingEvent);
			de.hhn.ai.sportwellbeing.Animator ldehhnaisportwellbeingAnimator = de.hhn.ai.sportwellbeing.AnimatorDAO.loadAnimatorByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.sportwellbeing.AnimatorDAO.save(ldehhnaisportwellbeingAnimator);
			de.hhn.ai.sportwellbeing.EventProvider ldehhnaisportwellbeingEventProvider = de.hhn.ai.sportwellbeing.EventProviderDAO.loadEventProviderByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.sportwellbeing.EventProviderDAO.save(ldehhnaisportwellbeingEventProvider);
			de.hhn.ai.sportwellbeing.Visitor ldehhnaisportwellbeingVisitor = de.hhn.ai.sportwellbeing.VisitorDAO.loadVisitorByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.sportwellbeing.VisitorDAO.save(ldehhnaisportwellbeingVisitor);
			de.hhn.ai.sportwellbeing.Place ldehhnaisportwellbeingPlace = de.hhn.ai.sportwellbeing.PlaceDAO.loadPlaceByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.sportwellbeing.PlaceDAO.save(ldehhnaisportwellbeingPlace);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateKlassendiagrammPMTData retrieveAndUpdateKlassendiagrammPMTData = new RetrieveAndUpdateKlassendiagrammPMTData();
			try {
				retrieveAndUpdateKlassendiagrammPMTData.retrieveAndUpdateTestData();
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
