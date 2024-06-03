package org.example.msdominio.repositories;

import org.example.msdominio.models.GrupoSanguineo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoSanguineoRepository extends JpaRepository<GrupoSanguineo, Long>{
	
} 