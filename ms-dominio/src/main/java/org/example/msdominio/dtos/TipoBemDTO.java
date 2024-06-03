package org.example.msdominio.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoBem;

@Data
@NoArgsConstructor
public class TipoBemDTO {

	private Long idenTipoBem;
	@NotNull(message = "O código do bem deve ser informado")
	private Long codgTipoBem;
	@NotEmpty(message = "A descrição do bem deve ser informado")
	private String descTipoBem;
	private Long statTipoBem;

	public TipoBemDTO(TipoBem tipoBem) {
		this.idenTipoBem = tipoBem.getIdenTipoBem();
		this.codgTipoBem = tipoBem.getCodgTipoBem();
		this.descTipoBem = tipoBem.getDescTipoBem();
		this.statTipoBem = tipoBem.getStatTipoBem();
	}

}