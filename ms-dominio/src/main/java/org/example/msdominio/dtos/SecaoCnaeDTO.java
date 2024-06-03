package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.SecaoCnae;

@Data
@NoArgsConstructor
public class SecaoCnaeDTO {

	private Long idenSecaoCnae;
	private String codgSecaoCnae;
	private String descSecaoCnae;
	private Long statSecaoCnae;

	public SecaoCnaeDTO(SecaoCnae secaoCnae) {
		this.idenSecaoCnae = secaoCnae.getIdenSecaoCnae();
		this.codgSecaoCnae = secaoCnae.getCodgSecaoCnae();
		this.descSecaoCnae = secaoCnae.getDescSecaoCnae();
		this.statSecaoCnae = secaoCnae.getStatSecaoCnae();
	}
}