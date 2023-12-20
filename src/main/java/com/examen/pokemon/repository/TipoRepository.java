package com.examen.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.pokemon.entity.Tipo;


public interface TipoRepository extends JpaRepository <Tipo, Long> {

}
