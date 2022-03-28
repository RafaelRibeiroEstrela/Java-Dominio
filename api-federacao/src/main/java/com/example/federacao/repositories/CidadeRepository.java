package com.example.federacao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.federacao.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	@Query("SELECT ci FROM Cidade ci WHERE ci.estado.id = :idEstado")
	List<Cidade> findByEstado(Long idEstado);
	
	@Query("SELECT ci FROM Cidade ci WHERE ci.nome LIKE %:nome%")
	List<Cidade> findByNome(String nome);

}
