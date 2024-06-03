package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_PODER_GOVERNO", schema = "DOMINIO")
@Getter
@Setter
public class PoderGoverno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PODER_GOVERNO")
	@SequenceGenerator(name = "SEQ_PODER_GOVERNO", sequenceName = "DOMSQ_PODER_GOVERNO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_PODER_GOVERNO")
	private Long idenPoderGoverno;

	@Column(name = "DESC_PODER_GOVERNO")
	private String descPoderGoverno;

	@Column(name = "SIGL_PODER_GOVERNO")
	private String siglPoderGoverno;

	@Column(name = "STAT_PODER_GOVERNO")
	private Long statPoderGoverno;

}
