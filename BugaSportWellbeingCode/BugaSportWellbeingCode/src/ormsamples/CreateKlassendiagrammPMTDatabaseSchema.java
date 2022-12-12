/**
 * Licensee: pgaug(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateKlassendiagrammPMTDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(de.hhn.ai.sportwellbeing.KlassendiagrammPMTPersistentManager.instance());
			de.hhn.ai.sportwellbeing.KlassendiagrammPMTPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
