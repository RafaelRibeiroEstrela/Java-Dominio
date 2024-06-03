package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoDocumento;

@Data
@NoArgsConstructor
public class TipoDocumentoDTO {

	private Long idenTipoDocumento;
	private String desTipoDocumento;
	private String siglTipoDocumento;
	private Long statTipoDocumento;

	public TipoDocumentoDTO(TipoDocumento tipoDocumento) {
		this.idenTipoDocumento = tipoDocumento.getIdenTipoDocumento();
		this.desTipoDocumento = tipoDocumento.getDesTipoDocumento();
		this.siglTipoDocumento = tipoDocumento.getSiglTipoDocumento();
		this.statTipoDocumento = tipoDocumento.getStatTipoDocumento();
	}
}