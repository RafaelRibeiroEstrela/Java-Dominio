package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_BANCO", schema = "DOMINIO")
@Getter
@Setter
public class Banco {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_BANCO")
	@SequenceGenerator(name = "SEQ_BANCO", sequenceName = "DOMSQ_BANCO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_BANCO")
	private Long idenBanco;

	@Column(name = "NOME_BANCO")
	private String nomeBanco;

	@Column(name = "SIGL_BANCO")
	private String siglBanco;

	@Column(name = "NUMR_BANCO")
	private String numrBanco;

	@Column(name = "STAT_BANCO")
	private Long statBanco;

	@Column(name = "DOCUMENTO")
	private String documento;

	@Column(name = "NETWORK")
	private String network;

	@Column(name = "TIPO_PIX")
	private String tipoPix;

	@Column(name = "URL")
	private String url;

	@Column(name = "DATA_INICIO_OPERACAO")
	private String dataInicioOperacao;

	@Column(name = "DATA_INICIO_PIX")
	private String dataInicioPix;

	@Column(name = "DATA_REGISTRO")
	private String dataRegistro;

	@Column(name = "DATA_ATUALIZACAO")
	private String dataAtualizacao;

	@Column(name = "TIPO_BANCO")
	private String tipoBanco;

	@Column(name = "ISPB")
	private String ispb;

}

