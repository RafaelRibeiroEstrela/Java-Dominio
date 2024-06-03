package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_NIVEL_FORMACAO", schema = "DOMINIO")
@Getter
@Setter
public class NivelFormacao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NIVEL_FORMACAO")
	@SequenceGenerator(name = "SEQ_NIVEL_FORMACAO", sequenceName = "DOMSQ_NIVEL_FORMACAO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_NIVEL_FORMACAO")
	private Long idenNivelFormacao;

	@Column(name = "NOME_NIVEL_FORMACAO")
	private String nomeNivelFormacao;

	@Column(name = "CODG_SEAP")
	private String codgSeap;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

	@Column(name = "ATUALIZACAO_SEAP")
	private Instant atualizacaoSeap;

	@Column(name = "FLAG_EXIBE_RECADASTRO")
	private Character flagExibeRecadastro;

	@Column(name = "NUMR_ORDEM")
	private Long numrOrdem;

}
