package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.Genero;


@Data
@NoArgsConstructor
public class GeneroDTO {

	private Long idenGenero;
	private String descGenero;
	private String siglGenero;
	private Long statGenero;

	public GeneroDTO(Genero genero) {
		this.idenGenero = genero.getIdenGenero();
		this.descGenero = genero.getDescGenero();
		this.siglGenero = genero.getSiglGenero();
		this.statGenero = genero.getStatGenero();
	}
}