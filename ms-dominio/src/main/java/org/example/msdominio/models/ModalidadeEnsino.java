package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_MODALIDADE_ENSINO", schema = "DOMINIO")
@Getter
@Setter
public class ModalidadeEnsino {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MODALIDADE_ENSINO")
	@SequenceGenerator(name = "SEQ_MODALIDADE_ENSINO", sequenceName = "DOMSQ_MODALIDADE_ENSINO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_MODALIDADE_ENSINO")
	private Long idenModalidadeEnsino;

	@Column(name = "NOME_MODALIDADE")
	private String nomeModalidade;

	@Column(name = "COD_SEAP")
	private String codSeap;

	@Column(name = "ATUALIZACAO_SEAP")
	private Instant atualizacaoSeap;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

	@Column(name = "STAT_MODALIDADE_ENSINO")
	private Long statModalidadeEnsino;
}
