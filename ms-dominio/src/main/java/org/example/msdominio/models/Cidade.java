package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_CIDADE", schema = "DOMINIO")
@Getter
@Setter
public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CIDADE")
	@SequenceGenerator(name = "SEQ_CIDADE", sequenceName = "DOMINIO.DOMSQ_CIDADE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_CIDADE")
	private Long idenCidade;

	@Column(name = "CODG_IBGE")
	private String codgIbge;

	@Column(name = "SIGL_CIDADE")
	private String siglCidade;

	@Column(name = "NOME_CIDADE")
	private String nomeCidade;

	@ManyToOne
	@JoinColumn(name = "IDEN_UF")
	private Uf uF;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;
	
	@Column(name = "CHAVE_BUSCA")
	private String chaveBusca;
	
} 
