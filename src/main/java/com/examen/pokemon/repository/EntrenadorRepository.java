package com.examen.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.pokemon.entity.Entrenador;

;

public interface EntrenadorRepository extends JpaRepository <Entrenador, Long> {

}
