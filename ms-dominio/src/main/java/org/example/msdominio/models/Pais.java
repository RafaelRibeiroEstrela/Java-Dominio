package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_PAIS", schema = "DOMINIO")
@Getter
@Setter
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PAIS")
	@SequenceGenerator(name = "SEQ_PAIS", sequenceName = "DOMSQ_PAIS", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_PAIS")
	private Long idenPais;

	@Column(name = "CODG_SPED")
	private String codgSped;

	@Column(name = "SIGL_PAIS")
	private String siglPais;

	@Column(name = "NOME_PAIS")
	private String nomePais;
}
