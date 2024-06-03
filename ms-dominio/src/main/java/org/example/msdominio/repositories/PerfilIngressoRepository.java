package org.example.msdominio.repositories;

import org.example.msdominio.models.PerfilIngresso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilIngressoRepository  extends JpaRepository<PerfilIngresso, Long>{

}
