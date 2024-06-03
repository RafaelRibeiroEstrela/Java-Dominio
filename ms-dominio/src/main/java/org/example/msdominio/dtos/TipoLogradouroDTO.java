package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoLogradouro;

@Data
@NoArgsConstructor
public class TipoLogradouroDTO {

	private Long idenTipoLogradouro;
	private String desTipoLogradouro;
	private String siglTipoDocumento;
	private Long statTipoLogradouro;
	private String desNormal;

	public TipoLogradouroDTO(TipoLogradouro tipoLogradouro) {
		this.idenTipoLogradouro = tipoLogradouro.getIdenTipoLogradouro();
		this.desTipoLogradouro = tipoLogradouro.getDesTipoLogradouro();
		this.siglTipoDocumento = tipoLogradouro.getSiglTipoDocumento();
		this.desNormal = tipoLogradouro.getDesNormal();
		this.statTipoLogradouro = tipoLogradouro.getStatTipoLogradouro();
	}

}