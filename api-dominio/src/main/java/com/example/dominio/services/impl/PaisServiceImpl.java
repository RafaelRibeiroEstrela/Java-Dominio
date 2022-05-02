package com.example.dominio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dominio.exceptions.ApiException;
import com.example.dominio.models.Pais;
import com.example.dominio.repositories.PaisRepository;
import com.example.dominio.services.PaisService;

@Service
public class PaisServiceImpl implements PaisService{
	
	@Autowired
	private PaisRepository paisRepository;

	@Override
	public List<Pais> findAll() {
		return paisRepository.findAll();
	}

	@Override
	public Pais findById(Long id) {
		return paisRepository.findById(id).orElseThrow(() -> new ApiException("Não foi encontrado um pais com id = " + id));
	}

	/*@Override
	public List<Pais> findByFilter(String nome, Long codigo) {
		List<Pais> paises = new ArrayList<>();
		if (nome != null) {
			paises.addAll(paisRepository.findByName(nome));
		}
		if (codigo != null) {
			paises.add(paisRepository.findByCodigo(codigo));
		}
		return paises;
	}*/
	
	public List<Pais> findByFilter(String nome, Long codigo){
		return paisRepository.findByFilter(nome, codigo);
	}
	

}
