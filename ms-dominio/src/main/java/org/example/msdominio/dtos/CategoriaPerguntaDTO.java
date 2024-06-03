package org.example.msdominio.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.CategoriaPergunta;

@Data
@NoArgsConstructor
public class CategoriaPerguntaDTO {

	private Long idenCategoriaPergunta;
	@NotEmpty(message = "DescrCategoriaPergunta deve ser informada.")
	private String descrCategoriaPergunta;
	private Long statCategoriaPergunta;
	private Long idenCategoriaPerguntaPai;

	public CategoriaPerguntaDTO(CategoriaPergunta categoriaPergunta) {
		this.idenCategoriaPergunta = categoriaPergunta.getIdenCategoriaPergunta();
		this.descrCategoriaPergunta = categoriaPergunta.getDescrCategoriaPergunta();
		this.statCategoriaPergunta = categoriaPergunta.getStatCategoriaPergunta();
		this.idenCategoriaPerguntaPai = categoriaPergunta.getCategoriaPerguntaPai().getIdenCategoriaPergunta();
	}
} 
