package com.example.federacao.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.federacao.models.Cidade;

public interface CidadeService {
	
	Page<Cidade> findPageable(Pageable pageable);
	List<Cidade> findAll();
	List<Cidade> findByNome(String nome);
	List<Cidade> findByEstado(Long idEstado);
	Cidade findById(Long id);
	Cidade save(Cidade obj);
	Cidade update(Long id, Cidade obj);
	void delete(Long id);

}
