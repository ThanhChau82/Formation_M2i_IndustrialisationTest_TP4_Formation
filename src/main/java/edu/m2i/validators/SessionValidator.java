package edu.m2i.validators;

public class SessionValidator extends CommunValidator {
	public boolean verifierDureeMin2Max100(int duree) {
		return duree >= 2 && duree <= 100;
	}
}
