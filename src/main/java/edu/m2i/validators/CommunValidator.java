package edu.m2i.validators;

public class CommunValidator {
	public boolean isConvertibleEntier (int id) {
		Integer value = Integer.valueOf(id);
		return value.getClass() == Integer.class;
	}
	
	public boolean verifierIdNotNull(Integer id) {
		return id != null;
	}
	
	public boolean verifierStringNonVide (String string) {
		return !string.isBlank();
	}
	
	public boolean verifierStringMin6 (String string) {
		return string.length() >= 6;
	}

}
