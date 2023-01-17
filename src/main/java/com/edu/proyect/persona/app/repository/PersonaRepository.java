package com.edu.proyect.persona.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.proyect.persona.app.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{
	
		
}
