package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_TIPO_DEPENDENTE", schema = "DOMINIO")
@Getter
@Setter
public class TipoDependente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_DEPENDENTE")
	@SequenceGenerator(name = "SEQ_TIPO_DEPENDENTE", sequenceName = "DOMSQ_TIPO_DEPENDENTE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_DEPENDENTE")
	private Long idTipoDependente;

	@Column(name = "CODG_TIPO_DEPENDENTE")
	private Long codigoTipoDependente;

	@Column(name = "DESC_TIPO_DEPENDENTE")
	private String descricaoTipoDependente;

	@Column(name = "STAT_TIPO_DEPENDENTE")
	private Long statusTipoDependente;
}
