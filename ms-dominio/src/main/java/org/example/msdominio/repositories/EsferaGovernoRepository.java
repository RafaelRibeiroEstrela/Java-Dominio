package org.example.msdominio.repositories;

import org.example.msdominio.models.EsferaGoverno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsferaGovernoRepository extends JpaRepository<EsferaGoverno, Long>{

}
