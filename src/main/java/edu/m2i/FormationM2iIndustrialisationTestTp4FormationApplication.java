package edu.m2i;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.m2i.entities.Formation;
import edu.m2i.entities.Session;
import edu.m2i.validators.FormationValidator;
import edu.m2i.validators.SessionValidator;

@SpringBootApplication
public class FormationM2iIndustrialisationTestTp4FormationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FormationM2iIndustrialisationTestTp4FormationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		verifierFormationValide();		
		verifierSessionValide();
	}

	private void verifierSessionValide() {
		Session session = new Session();
		session.setId(1);
		session.setDuree(50);
		session.setFormation("123456");
		
		SessionValidator sessionValidator = new SessionValidator();
		if (sessionValidator.verifierIdNotNull(session.getId())
				&& sessionValidator.isConvertibleEntier(session.getId())
				&& sessionValidator.verifierStringNonVide(session.getFormation())
				&& sessionValidator.verifierStringMin6(session.getFormation())
				&& sessionValidator.verifierDureeMin2Max100(session.getDuree())) {		
			System.out.println("Session " + session.toString() + " valide");
		} else {
			System.out.println("Session " + session.toString() + " n'est pas valide");
		}
	}

	private void verifierFormationValide() {
		Formation formation = new Formation();
		formation.setId(1);
		formation.setDescription("12345678910 test");
		formation.setPrix(101.0f);
		formation.setTitre("123456");
		
		FormationValidator formationValidator = new FormationValidator();
		if (formationValidator.verifierIdNotNull(formation.getId())
				&& formationValidator.isConvertibleEntier(formation.getId())
				&& formationValidator.verifierStringMin10(formation.getDescription())
				&& formationValidator.verifierStringPlusieursMots(formation.getDescription())
				&& formationValidator.verifierStringNonVide(formation.getTitre())
				&& formationValidator.verifierStringMin6(formation.getTitre())) {
			System.out.println("Formation " + formation.toString() + " valide");
		} else {
			System.out.println("Formation " + formation.toString() + " n'est pas valide");
		}
	}

}
