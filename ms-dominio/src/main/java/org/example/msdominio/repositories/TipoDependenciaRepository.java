package org.example.msdominio.repositories;

import org.example.msdominio.models.TipoDependencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDependenciaRepository extends JpaRepository<TipoDependencia, Long>{

}
