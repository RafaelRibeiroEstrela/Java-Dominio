package org.example.msdominio.repositories;

import org.example.msdominio.models.Escolaridade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaridadeRepository extends JpaRepository<Escolaridade, Long>{

} 