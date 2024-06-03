package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.EsferaGoverno;

@Data
@NoArgsConstructor
public class EsferaGovernoDTO {

	private Long idenEsferaGoverno;
	private String descEsferaGoverno;
	private String siglEsferaGoverno;
	private Long statEsferaGoverno;

	public EsferaGovernoDTO(EsferaGoverno esferaGoverno) {
		this.idenEsferaGoverno = esferaGoverno.getIdenEsferaGoverno();
		this.descEsferaGoverno = esferaGoverno.getDescEsferaGoverno();
		this.siglEsferaGoverno = esferaGoverno.getSiglEsferaGoverno();
		this.statEsferaGoverno = esferaGoverno.getStatEsferaGoverno();
	}

}