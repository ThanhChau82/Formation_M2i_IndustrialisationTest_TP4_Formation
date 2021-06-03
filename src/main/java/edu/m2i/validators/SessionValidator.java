package edu.m2i.validators;

import edu.m2i.entities.Session;

public class SessionValidator extends CommunValidator {
	public boolean verifierSessionValide(Session session) {
		if (verifierStringNonVide(session.getFormation())
				&& verifierStringMin6(session.getFormation())
				&& verifierDureeMin2Max100(session.getDuree())) {		
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifierDureeMin2Max100(int duree) {
		return duree >= 2 && duree <= 100;
	}
}
