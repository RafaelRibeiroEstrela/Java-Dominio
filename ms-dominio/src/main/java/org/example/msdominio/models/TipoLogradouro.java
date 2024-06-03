package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_TIPO_LOGRADOURO", schema = "DOMINIO")
@Getter
@Setter
public class TipoLogradouro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPO_LOGRADOURO")
	@SequenceGenerator(name = "SEQ_TIPO_LOGRADOURO", sequenceName = "DOMSQ_TIPO_LOGRADOURO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_TIPO_LOGRADOURO")
	private Long idenTipoLogradouro;

	@Column(name = "DESC_TIPO_LOGRADOURO")
	private String desTipoLogradouro;

	@Column(name = "SIGL_TIPO_LOGRADOURO")
	private String siglTipoDocumento;

	@Column(name = "STAT_TIPO_LOGRADOURO")
	private Long statTipoLogradouro;

	@Column(name = "DESC_NORMAL")
	private String desNormal;

}
