package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_AREA_CONHECIMENTO", schema = "DOMINIO")
@Getter
@Setter
public class AreaConhecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AREA_CONHECIMENTO")
	@SequenceGenerator(name = "SEQ_AREA_CONHECIMENTO", sequenceName = "DOMSQ_AREA_CONHECIMENTO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_AREA_CONHECIMENTO")
	private Long idenAreaConhecimento;

	@Column(name = "DESC_AREA_CONHECIMENTO")
	private String descAreaConhecimento;

	@Column(name = "CODG_SEAP")
	private Long codgSeap;

	@Column(name = "STAT_AREA_CONHECIMENTO")
	private Long statAreaConhecimento;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

}
