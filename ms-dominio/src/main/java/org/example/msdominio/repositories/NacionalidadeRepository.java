package org.example.msdominio.repositories;

import org.example.msdominio.models.Nacionalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacionalidadeRepository extends JpaRepository<Nacionalidade, Long>{
	
} 