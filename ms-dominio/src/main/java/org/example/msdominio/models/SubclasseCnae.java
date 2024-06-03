package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_SUBCLASSE_CNAE", schema = "DOMINIO")
@Getter
@Setter
public class SubclasseCnae {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SUBCLASSE_CNAE")
	@SequenceGenerator(name = "SEQ_SUBCLASSE_CNAE", sequenceName = "DOMSQ_SUBCLASSE_CNAE", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_SUBCLASSE_CNAE")
	private Long idenSubclasseCnae;

	@Column(name = "CODG_SUBCLASSE_CNAE")
	private String codgSubclasseCnae;

	@Column(name = "DESC_SUBCLASSE_CNAE")
	private String descSubclasseCnae;

	@Column(name = "STAT_SUBCLASSE_CNAE")
	private Long statSubclasseCnae;

	@ManyToOne
	@JoinColumn(name = "IDEN_CLASSE_CNAE")
	private ClasseCnae classeCnae;
}
