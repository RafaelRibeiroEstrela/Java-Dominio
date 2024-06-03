package org.example.msdominio.repositories;

import org.example.msdominio.models.TipoBem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoBemRepository extends JpaRepository<TipoBem, Long>{
	
} 