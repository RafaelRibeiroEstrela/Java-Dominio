package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_ESCOLARIDADE", schema = "DOMINIO")
@Getter
@Setter
public class Escolaridade {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ESCOLARIDADE")
	@SequenceGenerator(name = "SEQ_ESCOLARIDADE", sequenceName = "DOMSQ_ESCOLARIDADE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_ESCOLARIDADE")
	private Long idenEscolaridade;

	@Column(name = "NOME_ESCOLARIDADE")
	private String nomeEscolaridade;

	@Column(name = "CODG_SEAP")
	private String codgSeap;

	@Column(name = "FLAG_EXIBE_RECADASTRO")
	private Character flagExibeRecadastro;

	@Column(name = "NUMR_ORDEM")
	private Long numrOrdem;

	@Column(name = "ATUALIZACAO_SEAP")
	private Instant atualizacaoSeap;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

}
