package com.example.dominio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dominio.exceptions.ApiException;
import com.example.dominio.models.Pais;
import com.example.dominio.repositories.PaisRepository;
import com.example.dominio.services.PaisService;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository paisRepository;

	
	public List<Pais> findAll() {
		return paisRepository.findAll();
	}

	public Pais findById(Long id) {
		return paisRepository.findById(id).orElseThrow(() -> new ApiException("Não foi encontrado um pais com id = " + id));
	}
	
	public List<Pais> findByFilter(String nome, Long codigo){
		return paisRepository.findByFilter(nome, codigo);
	}
	
	public void deleteById(Long id) {
		paisRepository.findById(id).orElseThrow(() -> new ApiException("Não foi encontrado um pais com id = " + id));
		paisRepository.deleteById(id);
	}
	

}
