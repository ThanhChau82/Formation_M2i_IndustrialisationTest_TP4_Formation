package edu.m2i.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.m2i.dao.SessionDao;
import edu.m2i.entities.Session;
import edu.m2i.validators.SessionValidator;

@RestController
@RequestMapping("/session")
public class SessionController {
	@Autowired
	private SessionDao sessionDao;
	
	@PostMapping
	public void addSession(@Valid @RequestBody Session session) {
		SessionValidator sessionValidator = new SessionValidator();
		if (session != null 
				&& sessionValidator.verifierSessionValide(session)) {
			Session sessionSaved = sessionDao.save(session);
			System.out.println(sessionSaved.toString());			
		}		
	}
	
	@GetMapping
	public List<Session> getAllSessions() {
		return sessionDao.findAll();
	}
}
