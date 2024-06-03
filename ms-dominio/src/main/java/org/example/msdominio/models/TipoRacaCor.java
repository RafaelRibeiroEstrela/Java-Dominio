package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_TIPO_RACA_COR", schema = "DOMINIO")
@Getter
@Setter
public class TipoRacaCor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_RACA_COR")
	@SequenceGenerator(name = "SEQ_TIPO_RACA_COR", sequenceName = "DOMSQ_TIPO_RACA_COR", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_RACA_COR")
	private Long idenTipoRacaCor;

	@Column(name = "DESC_TIPO_RACA_COR")
	private String descTipoRacaCor;

	@Column(name = "CODG_SEAP")
	private Long codgSeap;

	@Column(name = "STAT_TIPO_RACA_COR")
	private Long statTipoRacaCor;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

}
