package com.edu.proyect.persona.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.edu.proyect.persona.app.model.Persona;
import com.edu.proyect.persona.app.repository.PersonaRepository;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Integer> implements PersonaService{
	
    @Autowired
    PersonaRepository personaRepository;
	
	@Override
	public CrudRepository<Persona, Integer> getDao() {
		// TODO Auto-generated method stub
		return personaRepository;
	}
	
	

}
