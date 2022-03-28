package com.example.federacao.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.federacao.models.Estado;
import com.example.federacao.repositories.EstadoRepository;
import com.example.federacao.services.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService{
	
	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public List<Estado> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estado> findByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado findByUnidadeFederativa(String uf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado save(Estado obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado update(Long id, Estado obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
