package org.example.msdominio.repositories;

import org.example.msdominio.models.OrgaoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgaoDocumentoRepository extends JpaRepository<OrgaoDocumento, Long> {

}
