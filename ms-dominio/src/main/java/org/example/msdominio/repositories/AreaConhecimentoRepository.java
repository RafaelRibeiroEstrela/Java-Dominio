package org.example.msdominio.repositories;

import org.example.msdominio.models.AreaConhecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaConhecimentoRepository extends JpaRepository<AreaConhecimento, Long>{
	
} 