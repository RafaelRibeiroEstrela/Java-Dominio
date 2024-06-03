package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_ORGAO_DOCUMENTO", schema = "DOMINIO")
@Getter
@Setter
public class OrgaoDocumento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ORGAO_DOCUMENTO")
	@SequenceGenerator(name = "SEQ_ORGAO_DOCUMENTO", sequenceName = "DOMSQ_ORGAO_DOCUMENTO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_ORGAO_DOCUMENTO")
	private Long idenOrgaoDocumento;

	@Column(name = "DESC_ORGAO_DOCUMENTO")
	private String descOrgaoDocumento;

	@Column(name = "SIGL_ORGAO_DOCUMENTO")
	private String siglOrgaoDocumento;

	@Column(name = "STAT_ORGAO_DOCUMENTO")
	private Long statOrgaoDocumento;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

	@Column(name = "FLAG_IDENTICACAO_PROF")
	private Character flagIdenticacaoProf;
}
