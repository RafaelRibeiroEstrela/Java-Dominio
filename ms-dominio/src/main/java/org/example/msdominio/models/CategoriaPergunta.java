package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_CATEGORIA_PERGUNTA", schema = "DOMINIO")
@Getter
@Setter
public class CategoriaPergunta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CATEGORIA_PERGUNTA")
	@SequenceGenerator(name = "SEQ_CATEGORIA_PERGUNTA", sequenceName = "DOMINIO.DOMSQ_CATEGORIA_PERGUNTA", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_CATEGORIA_PERGUNTA")
	private Long idenCategoriaPergunta;

	@Column(name = "DESC_CATEGORIA_PERGUNTA")
	private String descrCategoriaPergunta;

	@Column(name = "STAT_CATEGORIA_PERGUNTA")
	private Long statCategoriaPergunta;	

	@ManyToOne
	@JoinColumn(name = "IDEN_CAT_PERGUNTA_PAI", referencedColumnName="IDEN_CATEGORIA_PERGUNTA", updatable = false)
	private CategoriaPergunta categoriaPerguntaPai;


	
} 
