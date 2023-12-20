package com.examen.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.pokemon.entity.Pokemon;


public interface PokemonRepository extends JpaRepository <Pokemon, Long> {

}
