/**
 * Licensee: pgaug(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteKlassendiagrammPMTData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.ai.sportwellbeing.KlassendiagrammPMTPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.sportwellbeing.Person ldehhnaisportwellbeingPerson = de.hhn.ai.sportwellbeing.PersonDAO.loadPersonByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.sportwellbeing.PersonDAO.delete(ldehhnaisportwellbeingPerson);
			de.hhn.ai.sportwellbeing.Event ldehhnaisportwellbeingEvent = de.hhn.ai.sportwellbeing.EventDAO.loadEventByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.sportwellbeing.EventDAO.delete(ldehhnaisportwellbeingEvent);
			de.hhn.ai.sportwellbeing.Animator ldehhnaisportwellbeingAnimator = de.hhn.ai.sportwellbeing.AnimatorDAO.loadAnimatorByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.sportwellbeing.AnimatorDAO.delete(ldehhnaisportwellbeingAnimator);
			de.hhn.ai.sportwellbeing.EventProvider ldehhnaisportwellbeingEventProvider = de.hhn.ai.sportwellbeing.EventProviderDAO.loadEventProviderByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.sportwellbeing.EventProviderDAO.delete(ldehhnaisportwellbeingEventProvider);
			de.hhn.ai.sportwellbeing.Visitor ldehhnaisportwellbeingVisitor = de.hhn.ai.sportwellbeing.VisitorDAO.loadVisitorByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.sportwellbeing.VisitorDAO.delete(ldehhnaisportwellbeingVisitor);
			de.hhn.ai.sportwellbeing.Place ldehhnaisportwellbeingPlace = de.hhn.ai.sportwellbeing.PlaceDAO.loadPlaceByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.sportwellbeing.PlaceDAO.delete(ldehhnaisportwellbeingPlace);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteKlassendiagrammPMTData deleteKlassendiagrammPMTData = new DeleteKlassendiagrammPMTData();
			try {
				deleteKlassendiagrammPMTData.deleteTestData();
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
