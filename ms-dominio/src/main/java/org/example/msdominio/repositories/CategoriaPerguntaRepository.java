package org.example.msdominio.repositories;

import org.example.msdominio.models.CategoriaPergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaPerguntaRepository extends JpaRepository<CategoriaPergunta, Long>{

} 