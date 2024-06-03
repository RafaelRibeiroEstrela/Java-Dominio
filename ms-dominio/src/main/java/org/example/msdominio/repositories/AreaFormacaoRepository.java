package org.example.msdominio.repositories;

import org.example.msdominio.models.AreaFormacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaFormacaoRepository extends JpaRepository<AreaFormacao, Long>{

} 