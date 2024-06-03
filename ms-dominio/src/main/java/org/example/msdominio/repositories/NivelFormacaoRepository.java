package org.example.msdominio.repositories;

import org.example.msdominio.models.NivelFormacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelFormacaoRepository extends JpaRepository<NivelFormacao, Long>{

} 