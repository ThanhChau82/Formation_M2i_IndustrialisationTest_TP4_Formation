package edu.m2i.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.m2i.dao.FormationDao;
import edu.m2i.entities.Formation;
import edu.m2i.validators.FormationValidator;

@RestController
@RequestMapping("/formation")
public class FormationController {
	@Autowired
	private FormationDao formationDao;
	
	@PostMapping
	public Formation addFormation(@Valid @RequestBody Formation formation ) {
		FormationValidator formationValidator = new FormationValidator();
		
		if (formation != null 
				&& formationValidator.verifierFormation(formation)) {
			Formation formationSaved = formationDao.save(formation);			
			return formationSaved;
			
		}	
		
		return null;
	}
	
	@GetMapping
	public List<Formation> getAllFormations() {
		return formationDao.findAll();
	}
}
