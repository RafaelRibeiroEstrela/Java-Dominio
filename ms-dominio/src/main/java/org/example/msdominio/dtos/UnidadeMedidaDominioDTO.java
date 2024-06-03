package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.UnidadeMedidaDominio;


@Data
@NoArgsConstructor
public class UnidadeMedidaDominioDTO {

	private Long idenUnidadeMedida;
	private Long codgUnidadeMedida;
	private String descUnidadeMedida;
	private Long statUnidadeMedida;
	private String siglUnidadeMedida;

	public UnidadeMedidaDominioDTO(UnidadeMedidaDominio unidadeMedidaDominio) {
		this.idenUnidadeMedida = unidadeMedidaDominio.getIdenUnidadeMedida();
		this.codgUnidadeMedida = unidadeMedidaDominio.getCodgUnidadeMedida();
		this.descUnidadeMedida = unidadeMedidaDominio.getDescUnidadeMedida();
		this.statUnidadeMedida = unidadeMedidaDominio.getStatUnidadeMedida();
		this.siglUnidadeMedida = unidadeMedidaDominio.getSiglUnidadeMedida();
	}

}