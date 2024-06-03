package org.example.msdominio.repositories;

import org.example.msdominio.models.PoderGoverno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoderGovernoRepository extends JpaRepository<PoderGoverno, Long>{

}
