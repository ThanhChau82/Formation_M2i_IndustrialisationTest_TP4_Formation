package edu.m2i.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CommunValidatorTests {
	private static CommunValidator communValidator;
	
	@BeforeAll
	public static void init() {
		communValidator = new CommunValidator();
	}
	
	@Test
	public void testIsConvertibleEntierOK() {
		assertTrue(communValidator.isConvertibleEntier(1));
	}

	@Test
	public void testVerifierIdNotNullKO() {
		assertFalse(communValidator.verifierIdNotNull(null));
	}
	
	@Test
	public void testVerifierStringNonVideKO() {
		assertFalse(communValidator.verifierStringNonVide(" "));
	}
	
	@Test
	public void testVerifierStringMin6OK() {
		assertTrue(communValidator.verifierStringMin6("123456"));
	}
	
	@Test
	public void testVerifierStringMin6KO() {
		assertFalse(communValidator.verifierStringMin6("12345"));
	}
}
