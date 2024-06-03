package org.example.msdominio.repositories;

import org.example.msdominio.models.TipoPergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPerguntaRepository extends JpaRepository<TipoPergunta, Long>{
	
} 