package org.example.msdominio.repositories;

import org.example.msdominio.models.TipoDependente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDependenteRepository extends JpaRepository<TipoDependente, Long>{
	
}
