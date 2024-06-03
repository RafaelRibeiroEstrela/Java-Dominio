package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.Pais;

@Data
@NoArgsConstructor
public class PaisDTO {

	private Long idenPais;
	private String codgSped;
	private String siglPais;
	private String nomePais;

	public PaisDTO(Pais pais) {
		this.idenPais = pais.getIdenPais();
		this.codgSped = pais.getCodgSped();
		this.siglPais = pais.getSiglPais();
		this.nomePais = pais.getNomePais();
	}
}