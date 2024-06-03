package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_TIPO_DEPENDENCIA", schema = "DOMINIO")
@Getter
@Setter
public class TipoDependencia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_DEPENDENCIA")
	@SequenceGenerator(name = "SEQ_TIPO_DEPENDENCIA", sequenceName = "DOMSQ_TIPO_DEPENDENCIA", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_DEPENDENCIA")
	private Long idenTipoDependencia;

	@Column(name = "DESC_TIPO_DEPENDENCIA")
	private String descTipoDependencia;

	@Column(name = "CODG_SEAP")
	private Long codgSeap;

	@Column(name = "STAT_TIPO_DEPENDENCIA")
	private Long statTipoDependencia;

}
