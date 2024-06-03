package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_GENERO", schema = "DOMINIO")
@Getter
@Setter
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GENERO")
	@SequenceGenerator(name = "SEQ_GENERO", sequenceName = "DOMSQ_GENERO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_GENERO")
	private Long idenGenero;

	@Column(name = "DESC_GENERO")
	private String descGenero;

	@Column(name = "SIGL_GENERO")
	private String siglGenero;

	@Column(name = "STAT_GENERO")
	private Long statGenero;
}
