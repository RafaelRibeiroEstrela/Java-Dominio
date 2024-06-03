package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "DOMTB_UF", schema = "DOMINIO")
@Getter
@Setter
public class Uf {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_UF")
	@SequenceGenerator(name = "SEQ_UF", sequenceName = "DOMSQ_UF", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_UF")
	private Long idenUf;

	@Column(name = "CODG_IBGE")
	private String codgIbge;

	@Column(name = "SIGL_UF")
	private String siglUf;

	@Column(name = "NOME_UF")
	private String nomeUf;

	@ManyToOne
	@JoinColumn(name = "IDEN_PAIS")
	private Pais pais;

	@Column(name = "DATA_ATUALIZACAO")
	private Instant dataAtualizacao;

	@Column(name = "DATA_IMPORTACAO")
	private Instant dataImportacao;

}
