package com.examen.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.pokemon.entity.Entrenador;
import com.examen.pokemon.repository.EntrenadorRepository;


@RestController
@RequestMapping("/api/pokemon")
public class EntrenadorController {

	
	@Autowired
	private EntrenadorRepository entrenadorRepository;
	
	@GetMapping
	public ResponseEntity<Page<Entrenador>> listarEntrenadores(Pageable pageable){
		return ResponseEntity.ok(entrenadorRepository.findAll(pageable));
	}
	
	
}
