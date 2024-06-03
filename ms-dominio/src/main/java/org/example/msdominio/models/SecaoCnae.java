package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_SECAO_CNAE", schema = "DOMINIO")
@Getter
@Setter
public class SecaoCnae {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SECAO_CNAE")
	@SequenceGenerator(name = "SEQ_SECAO_CNAE", sequenceName = "DOMSQ_SECAO_CNAE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_SECAO_CNAE")
	private Long idenSecaoCnae;

	@Column(name = "CODG_SECAO_CNAE")
	private String codgSecaoCnae;

	@Column(name = "DESC_SECAO_CNAE")
	private String descSecaoCnae;

	@Column(name = "STAT_SECAO_CNAE")
	private Long statSecaoCnae;
}
