package com.edu.proyect.persona.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.proyect.persona.app.model.Persona;
import com.edu.proyect.persona.app.service.PersonaService;
@RestController
public class PersonaController {
	
    @Autowired
    PersonaService personaService;
    
	@GetMapping("/listar")
	public ResponseEntity<List<Persona>> obtenerLista(){
		return new ResponseEntity<>(personaService.findByAll(),HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Persona> crear(@RequestBody Persona p){
		return new ResponseEntity<>(personaService.save(p),HttpStatus.CREATED);
	}
	

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Persona> actualizar(@RequestBody Persona p,@PathVariable Integer id){
		Persona pe=personaService.findById(id);
		pe.setNombre(p.getNombre());
		pe.setClave(p.getClave());
		pe.setEmail(p.getEmail());
		pe.setEstado(p.getEstado());
		
		return new ResponseEntity<>(personaService.save(pe),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id){
		personaService.delete(id);
	}
	
	
	
}
