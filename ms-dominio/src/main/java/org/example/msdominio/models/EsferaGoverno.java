package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_ESFERA_GOVERNO", schema = "DOMINIO")
@Getter
@Setter
public class EsferaGoverno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ESFERA_GOVERNO")
	@SequenceGenerator(name = "SEQ_ESFERA_GOVERNO", sequenceName = "DOMSQ_ESFERA_GOVERNO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_ESFERA_GOVERNO")
	private Long idenEsferaGoverno;

	@Column(name = "DESC_ESFERA_GOVERNO")
	private String descEsferaGoverno;

	@Column(name = "SIGL_ESFERA_GOVERNO")
	private String siglEsferaGoverno;

	@Column(name = "STAT_ESFERA_GOVERNO")
	private Long statEsferaGoverno;
}
