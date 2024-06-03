package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_ESTADO_CIVIL", schema = "DOMINIO")
@Getter
@Setter
public class EstadoCivil {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ESTADO_CIVIL")
	@SequenceGenerator(name = "SEQ_ESTADO_CIVIL", sequenceName = "DOMSQ_ESTADO_CIVIL", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_ESTADO_CIVIL")
	private Long idenEstadoCivil;

	@Column(name = "DESC_ESTADO_CIVIL")
	private String descEstadoCivil;

	@Column(name = "CODG_SEAP")
	private String codgSeap;

	@Column(name = "STAT_ESTADO_CIVIL")
	private Long statEstadoCivil;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

}
