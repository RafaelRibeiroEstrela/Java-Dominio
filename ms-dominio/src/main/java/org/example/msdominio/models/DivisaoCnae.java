package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_DIVISAO_CNAE", schema = "DOMINIO")
@Getter
@Setter
public class DivisaoCnae {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DIVISAO_CNAE")
	@SequenceGenerator(name = "SEQ_DIVISAO_CNAE", sequenceName = "DOMSQ_DIVISAO_CNAE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_DIVISAO_CNAE")
	private Long idenDivisaoCnae;

	@Column(name = "CODG_DIVISAO_CNAE")
	private String codgDivisaoCnae;

	@Column(name = "DESC_DIVISAO_CNAE")
	private String descDivisaoCnae;

	@Column(name = "STAT_DIVISAO_CNAE")
	private Long statDivisaoCnae;

	@ManyToOne
	@JoinColumn(name = "IDEN_SECAO_CNAE")
	private SecaoCnae secaoCnae;
}