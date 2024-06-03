package org.example.msdominio.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoDependente;

@Data
@NoArgsConstructor
public class TipoDependenteDTO {

	private Long idTipoDependente;
	private Long codigoTipoDependente;
	@NotEmpty(message = "A descrição do tipo dependente é obrigatória.")
	private String descricaoTipoDependente;
	private Long statusTipoDependente;

	public TipoDependenteDTO(TipoDependente tipoDependente) {
		this.idTipoDependente = tipoDependente.getIdTipoDependente();
		this.codigoTipoDependente = tipoDependente.getCodigoTipoDependente();
		this.descricaoTipoDependente = tipoDependente.getDescricaoTipoDependente();
		this.statusTipoDependente = tipoDependente.getStatusTipoDependente();
	}

}