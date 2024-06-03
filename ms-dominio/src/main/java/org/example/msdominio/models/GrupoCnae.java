package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_GRUPO_CNAE", schema = "DOMINIO")
@Getter
@Setter
public class GrupoCnae {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GRUPO_CNAE")
	@SequenceGenerator(name = "SEQ_GRUPO_CNAE", sequenceName = "DOMSQ_GRUPO_CNAE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_GRUPO_CNAE")
	private Long idenGrupoCnae;

	@Column(name = "CODG_GRUPO_CNAE")
	private String codgGrupoCnae;

	@Column(name = "DESC_GRUPO_CNAE")
	private String descGrupoCnae;

	@Column(name = "STAT_GRUPO_CNAE")
	private Long statGrupoCnae;

	@ManyToOne
	@JoinColumn(name = "IDEN_DIVISAO_CNAE")
	private DivisaoCnae divisaoCnae;
}
