package edu.m2i.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FormationValidatorTests {
	private static FormationValidator formationValidator;
	
	@BeforeAll
	public static void init() {
		formationValidator = new FormationValidator();
	}
	
	@Test
	public void testVerifierPrixSuperieur10OK() {
		assertTrue(formationValidator.verifierPrixSuperieur100(101.0f));
	}
	
	@Test
	public void testVerifierPrixSuperieur10KO() {
		assertFalse(formationValidator.verifierPrixSuperieur100(100.0f));
	}
	
	@Test
	public void testVerifierStringMin10OK() {
		assertTrue(formationValidator.verifierStringMin10("12345678910"));
	}
	
	@Test
	public void testVerifierStringMin10KO() {
		assertFalse(formationValidator.verifierStringMin10("123456789"));
	}
	
	@Test
	public void testVerifierStringPlusieursMotsOK() {
		assertTrue(formationValidator.verifierStringPlusieursMots(" test test "));
	}
	
	@Test
	public void testVerifierStringPlusieursMotsKO() {
		assertFalse(formationValidator.verifierStringPlusieursMots(" testtest "));
	}
}
