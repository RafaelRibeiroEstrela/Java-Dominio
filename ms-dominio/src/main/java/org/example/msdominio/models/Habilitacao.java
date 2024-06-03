package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_HABILITACAO", schema = "DOMINIO")
@Getter
@Setter
public class Habilitacao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_HABILITACAO")
	@SequenceGenerator(name = "SEQ_HABILITACAO", sequenceName = "DOMSQ_HABILITACAO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_HABILITACAO")
	private Long idenHabilitacao;

	@Column(name = "DESC_HABILITACAO")
	private String descHabilitacao;

	@Column(name = "CODG_SEAP")
	private String codgSeap;

	@Column(name = "STAT_HABILITACAO")
	private Long statHabilitacao;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

	@Column(name = "NUMR_ORDEM")
	private Long numrOrdem;
}
