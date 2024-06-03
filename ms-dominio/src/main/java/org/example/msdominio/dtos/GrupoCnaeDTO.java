package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.GrupoCnae;

@Data
@NoArgsConstructor
public class GrupoCnaeDTO {

	private Long idenGrupoCnae;
	private String codgGrupoCnae;
	private String descGrupoCnae;
	private Long statGrupoCnae;
	private DivisaoCnaeDTO divisaoCnaeDTO;

	public GrupoCnaeDTO(GrupoCnae grupoCnae) {
		this.idenGrupoCnae = grupoCnae.getIdenGrupoCnae();
		this.codgGrupoCnae = grupoCnae.getCodgGrupoCnae();
		this.descGrupoCnae = grupoCnae.getDescGrupoCnae();
		this.statGrupoCnae = grupoCnae.getStatGrupoCnae();
		this.divisaoCnaeDTO = new DivisaoCnaeDTO(grupoCnae.getDivisaoCnae());
	}

}