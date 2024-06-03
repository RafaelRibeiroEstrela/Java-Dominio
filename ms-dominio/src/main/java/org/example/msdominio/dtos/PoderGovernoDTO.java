package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.PoderGoverno;

@Data
@NoArgsConstructor
public class PoderGovernoDTO {

	private Long idenPoderGoverno;
	private String descEsferaGoverno;
	private String siglEsferaGoverno;
	private Long statEsferaGoverno;

	public PoderGovernoDTO(PoderGoverno poderGoverno) {
		this.idenPoderGoverno = poderGoverno.getIdenPoderGoverno();
		this.descEsferaGoverno = poderGoverno.getDescPoderGoverno();
		this.siglEsferaGoverno = poderGoverno.getSiglPoderGoverno();
		this.statEsferaGoverno = poderGoverno.getStatPoderGoverno();
	}

}