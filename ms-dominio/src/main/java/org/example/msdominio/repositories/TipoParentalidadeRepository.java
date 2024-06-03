package org.example.msdominio.repositories;

import org.example.msdominio.models.TipoParentalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoParentalidadeRepository extends JpaRepository<TipoParentalidade, Long>{
	
} 