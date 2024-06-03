package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_TIPO_PARENTALIDADE", schema = "DOMINIO")
@Getter
@Setter
public class TipoParentalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_PARENTALIDADE")
	@SequenceGenerator(name = "SEQ_TIPO_PARENTALIDADE", sequenceName = "DOMSQ_TIPO_PARENTALIDADE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_PARENTALIDADE")
	private Long idenTipoParentalidade;

	@Column(name = "DESC_TIPO_PARENTALIDADE")
	private String descTipoParentalidade;

	@Column(name = "CODG_SEAP")
	private String codgSeap;

	@Column(name = "STAT_TIPO_PARENTALIDADE")
	private Long statTipoParentalidade;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

}
