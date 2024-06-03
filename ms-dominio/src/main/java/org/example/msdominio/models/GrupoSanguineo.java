package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_GRUPO_SANGUINEO", schema = "DOMINIO")
@Getter
@Setter
public class GrupoSanguineo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GRUPO_SANGUINEO")
	@SequenceGenerator(name = "SEQ_GRUPO_SANGUINEO", sequenceName = "DOMSQ_GRUPO_SANGUINEO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_GRUPO_SANGUINEO")
	private Long idenGrupoSanguineo;

	@Column(name = "DESC_GRUPO_SANGUINEO")
	private String descGrupoSanguineo;

	@Column(name = "CODG_SEAP")
	private String codgSeap;

	@Column(name = "STAT_GRUPO_SANGUINEO")
	private Long statGrupoSanguineo;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

}
