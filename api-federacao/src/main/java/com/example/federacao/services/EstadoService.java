package com.example.federacao.services;

import java.util.List;

import com.example.federacao.models.Estado;

public interface EstadoService {
	
	List<Estado> findAll();
	List<Estado> findByNome(String nome);
	Estado findById(Long id);
	Estado findByUnidadeFederativa(String uf);
	Estado save(Estado obj);
	Estado update(Long id, Estado obj);
	void delete(Long id);

}
