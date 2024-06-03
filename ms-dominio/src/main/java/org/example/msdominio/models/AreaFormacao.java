package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_AREA_FORMACAO", schema = "DOMINIO")
@Getter
@Setter
public class AreaFormacao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AREA_FORMACAO")
	@SequenceGenerator(name = "SEQ_AREA_FORMACAO", sequenceName = "DOMSQ_AREA_FORMACAO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_AREA_FORMACAO")
	private Long idenAreaFormacao;

	@Column(name = "DESC_AREA_FORMACAO")
	private String descAreaFormacao;

	@Column(name = "CODG_SEAP")
	private Long codgSeap;

	@Column(name = "STAT_AREA_FORMACAO")
	private Long statAreaFormacao;

	@Column(name = "SIGL_AREA_FORMACAO")
	private String siglAreaFormacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "FLAG_EXIBE_RECADASTRO")
	private Character flagExibeRecadastro;

}