package com.example.dominio.services;

import java.util.List;

import com.example.dominio.models.Pais;

public interface PaisService {
	
	List<Pais> findAll();
	Pais findById(Long id);
	List<Pais> findByFilter(String nome, Long codigo);

}
