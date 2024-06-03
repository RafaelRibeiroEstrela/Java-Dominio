package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_TIPO_BEM", schema = "DOMINIO")
@Getter
@Setter
public class TipoBem {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_BEM")
	@SequenceGenerator(name = "SEQ_TIPO_BEM", sequenceName = "DOMSQ_TIPO_BEM", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_BEM")
	private Long idenTipoBem;

	@Column(name = "CODG_TIPO_BEM")
	private Long codgTipoBem;

	@Column(name = "DESC_TIPO_BEM")
	private String descTipoBem;

	@Column(name = "STAT_TIPO_BEM")
	private Long statTipoBem;
}
