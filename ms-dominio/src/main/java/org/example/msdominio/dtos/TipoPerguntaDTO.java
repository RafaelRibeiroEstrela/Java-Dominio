package org.example.msdominio.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoPergunta;

@Data
@NoArgsConstructor
public class TipoPerguntaDTO {

	private Long idenTipoPergunta;
	@NotEmpty(message = "A descrição deve ser informada")
	private String descTipoPergunta;
	private String siglTipoPergunta;
	private Long statPergunta;

	public TipoPerguntaDTO(TipoPergunta tipoPergunta) {
		this.idenTipoPergunta = tipoPergunta.getIdenTipoPergunta();
		this.descTipoPergunta = tipoPergunta.getDescTipoPergunta();
		this.siglTipoPergunta = tipoPergunta.getSiglTipoPergunta();
		this.statPergunta = tipoPergunta.getStatPergunta();
	}
}