package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_NACIONALIDADE", schema = "DOMINIO")
@Getter
@Setter
public class Nacionalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NACIONALIDADE")
	@SequenceGenerator(name = "SEQ_NACIONALIDADE", sequenceName = "DOMSQ_NACIONALIDADE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_NACIONALIDADE")
	private Long idenNacionalidade;

	@Column(name = "DESC_NACIONALIDADE")
	private String descNacionalidade;

	@Column(name = "CODG_SEAP")
	private Long codgSeap;

	@Column(name = "STAT_NACIONALIDADE")
	private Long statNacionalidade;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

}
