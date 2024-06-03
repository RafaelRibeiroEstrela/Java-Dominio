package org.example.msdominio.repositories;

import org.example.msdominio.models.ModalidadeEnsino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeEnsinoRepository extends JpaRepository<ModalidadeEnsino, Long>{
	
} 