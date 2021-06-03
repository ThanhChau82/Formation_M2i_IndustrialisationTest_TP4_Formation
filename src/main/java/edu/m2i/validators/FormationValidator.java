package edu.m2i.validators;

import edu.m2i.entities.Formation;

public class FormationValidator extends CommunValidator {
	public boolean verifierFormation(Formation formation) {
		if (verifierStringMin10(formation.getDescription())
				&& verifierStringPlusieursMots(formation.getDescription())
				&& verifierStringNonVide(formation.getTitre())
				&& verifierStringMin6(formation.getTitre())
				&& verifierPrixSuperieur100(formation.getPrix())) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifierPrixSuperieur100(float prix) {
		return prix > 100.0;
	}
	
	public boolean verifierStringMin10 (String string) {
		return string.length() >= 10;
	}
	
	public boolean verifierStringPlusieursMots (String string) {		
		return string.trim().contains(" ");
	}
}
