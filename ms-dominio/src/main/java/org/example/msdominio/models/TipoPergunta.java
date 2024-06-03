package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_TIPO_PERGUNTA", schema = "DOMINIO")
@Getter
@Setter
public class TipoPergunta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_PERGUNTA")
	@SequenceGenerator(name = "SEQ_TIPO_PERGUNTA", sequenceName = "DOMSQ_TIPO_PERGUNTA", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_PERGUNTA")
	private Long idenTipoPergunta;

	@Column(name = "DESC_TIPO_PERGUNTA")
	private String descTipoPergunta;

	@Column(name = "SIGL_TIPO_PERGUNTA")
	private String siglTipoPergunta;

	@Column(name = "STAT_TIPO_PERGUNTA")
	private Long statPergunta;
}
