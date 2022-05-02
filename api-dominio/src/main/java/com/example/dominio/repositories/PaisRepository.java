package com.example.dominio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dominio.models.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long>{
	
	@Query("SELECT p FROM Pais p "
			+ "WHERE UPPER(p.nome) LIKE '%' || UPPER(:nome) || '%' ")
	List<Pais> findByName(String nome);
	
	@Query("SELECT p FROM Pais p "
			+ "WHERE p.codigo = :codigo")
	Pais findByCodigo(Long codigo);
	
	
	@Query("SELECT p FROM Pais p "
			+ "WHERE (:nome IS NULL OR UPPER(p.nome) LIKE '%' || UPPER(:nome) || '%') "
			+ "AND (:codigo IS NULL OR p.codigo = :codigo) ")
	List<Pais> findByFilter(String nome, Long codigo);

}
