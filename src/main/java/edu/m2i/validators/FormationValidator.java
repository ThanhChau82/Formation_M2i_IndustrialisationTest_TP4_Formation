package edu.m2i.validators;

public class FormationValidator extends CommunValidator {
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
