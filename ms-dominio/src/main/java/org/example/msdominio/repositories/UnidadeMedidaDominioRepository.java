package org.example.msdominio.repositories;

import org.example.msdominio.models.UnidadeMedidaDominio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeMedidaDominioRepository extends JpaRepository<UnidadeMedidaDominio, Long>{

}
