package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_TIPO_DEFICIENCIA", schema = "DOMINIO")
@Getter
@Setter
public class TipoDeficiencia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_DEFICIENCIA")
	@SequenceGenerator(name = "SEQ_TIPO_DEFICIENCIA", sequenceName = "DOMSQ_TIPO_DEFICIENCIA", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_DEFICIENCIA")
	private Long idenTipoDeficiencia;

	@Column(name = "DESC_TIPO_DEFICIENCIA")
	private String descTipoDeficiencia;

	@Column(name = "STAT_TIPO_DEFICIENCIA")
	private Long statTipoDeficiencia;

	@Column(name = "CODG_SEAP")
	private String codgSeap;

	@Column(name = "ATUALIZACAO_SEAP")
	private Instant atualizacaoSeap;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;
}
