package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoDependencia;

@Data
@NoArgsConstructor
public class TipoDependenciaDTO {

	private Long idenTipoDependencia;
	private String descTipoDependencia;
	private Long codgSeap;
	private Long statTipoDependencia;

	public TipoDependenciaDTO(TipoDependencia tipoDependencia) {
		this.idenTipoDependencia = tipoDependencia.getIdenTipoDependencia();
		this.descTipoDependencia = tipoDependencia.getDescTipoDependencia();
		this.codgSeap = tipoDependencia.getCodgSeap();
		this.statTipoDependencia = tipoDependencia.getStatTipoDependencia();
	}
}