package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.DivisaoCnae;

@Data
@NoArgsConstructor
public class DivisaoCnaeDTO {

	private Long idenDivisaoCnae;
	private String codgDivisaoCnae;
	private String descDivisaoCnae;
	private Long statDivisaoCnae;
	private SecaoCnaeDTO secaoCnae;

	public DivisaoCnaeDTO(DivisaoCnae divisaoCnae) {
		this.idenDivisaoCnae = divisaoCnae.getIdenDivisaoCnae();
		this.codgDivisaoCnae = divisaoCnae.getCodgDivisaoCnae();
		this.descDivisaoCnae = divisaoCnae.getDescDivisaoCnae();
		this.statDivisaoCnae = divisaoCnae.getStatDivisaoCnae();
		this.secaoCnae = new SecaoCnaeDTO(divisaoCnae.getSecaoCnae());
	}
}