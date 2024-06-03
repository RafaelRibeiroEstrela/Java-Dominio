package org.example.msdominio.repositories;

import org.example.msdominio.models.TipoRacaCor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRacaCorRepository extends JpaRepository<TipoRacaCor, Long>{
	
} 