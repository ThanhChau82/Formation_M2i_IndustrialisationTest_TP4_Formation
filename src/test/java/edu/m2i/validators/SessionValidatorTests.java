package edu.m2i.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SessionValidatorTests {
	private static SessionValidator sessionValidator;
	
	@BeforeAll
	public static void init() {
		sessionValidator = new SessionValidator();
	}
	
	@Test
	public void testVerifierDureeMin2Max100OK() {
		assertTrue(sessionValidator.verifierDureeMin2Max100(50));
	}
	
	@Test
	public void testVerifierDureeMin2Max100KOInferior() {
		assertFalse(sessionValidator.verifierDureeMin2Max100(1));
	}
	
	@Test
	public void testVerifierDureeMin2Max100KOSuperior() {
		assertFalse(sessionValidator.verifierDureeMin2Max100(101));
	}
}
