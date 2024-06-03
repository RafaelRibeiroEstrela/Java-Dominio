package org.example.msdominio.repositories;

import org.example.msdominio.models.TipoDeficiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeficienciaRepository extends JpaRepository<TipoDeficiencia, Long>{
	
} 