package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_UNIDADE_MEDIDA", schema = "DOMINIO")
@Getter
@Setter
public class UnidadeMedidaDominio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_UNIDADE_MEDIDA")
	@SequenceGenerator(name = "SEQ_UNIDADE_MEDIDA", sequenceName = "DOMSQ_UNIDADE_MEDIDA", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_UNIDADE_MEDIDA")
	private Long idenUnidadeMedida;

	@Column(name = "CODG_UNIDADE_MEDIDA")
	private Long codgUnidadeMedida;

	@Column(name = "DESC_UNIDADE_MEDIDA")
	private String descUnidadeMedida;

	@Column(name = "STAT_UNIDADE_MEDIDA")
	private Long statUnidadeMedida;

	@Column(name = "SIGL_UNIDADE_MEDIDA")
	private String siglUnidadeMedida;
}
