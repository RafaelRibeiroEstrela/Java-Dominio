package com.example.federacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.federacao.models.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
	
	@Query("SELECT es FROM Estado es WHERE es.unidadeFederativa = :unidadeFederativa")
	Estado findByUnidadeFederativa(String unidadeFederativa);
	
	@Query("SELECT es FROM Estado es WHERE es.nome LIKE %:nome%")
	List<Estado> findByNome(String nome);

}
