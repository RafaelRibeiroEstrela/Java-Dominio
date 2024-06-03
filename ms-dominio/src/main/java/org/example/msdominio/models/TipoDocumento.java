package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_TIPO_DOCUMENTO", schema = "DOMINIO")
@Getter
@Setter
public class TipoDocumento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_DOCUMENTO")
	@SequenceGenerator(name = "SEQ_TIPO_DOCUMENTO", sequenceName = "DOMSQ_TIPO_DOCUMENTO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_DOCUMENTO")
	private Long idenTipoDocumento;

	@Column(name = "DESC_TIPO_DOCUMENTO")
	private String desTipoDocumento;

	@Column(name = "SIGL_TIPO_DOCUMENTO")
	private String siglTipoDocumento;

	@Column(name = "STAT_TIPO_DOCUMENTO")
	private Long statTipoDocumento;
}
