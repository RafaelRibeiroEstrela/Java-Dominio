package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_FORMACAO_CONTINUADA", schema = "DOMINIO")
@Getter
@Setter
public class FormacaoContinuada {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FORMACAO_CONTINUADA")
	@SequenceGenerator(name = "SEQ_FORMACAO_CONTINUADA", sequenceName = "DOMSQ_FORMACAO_CONTINUADA", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_FORMACAO_CONTINUADA")
	private Long idenFormacaoContinuada;

	@Column(name = "NOME_FORMACAO_CONTINUADA")
	private String nomeFormacaoContinuada;

	@Column(name = "CODG_SEAP")
	private String codgSeap;

	@Column(name = "ATUALIZACAO_SEAP")
	private Instant atualizacaoSeap;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

	@Column(name = "FLAG_EXIBE_RECADASTRO")
	private Character flagExibeRecadastro;
}
