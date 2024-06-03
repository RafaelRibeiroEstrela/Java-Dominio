package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.ModalidadeEnsino;

import java.time.Instant;

@Data
@NoArgsConstructor
public class ModalidadeEnsinoDTO {

	private Long idenModalidadeEnsino;
	private String nomeModalidade;
	private String codSeap;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant atualizacaoSeap;
	private Long statModalidadeEnsino;

	public ModalidadeEnsinoDTO(ModalidadeEnsino modalidadeEnsino) {
		this.idenModalidadeEnsino = modalidadeEnsino.getIdenModalidadeEnsino();
		this.nomeModalidade = modalidadeEnsino.getNomeModalidade();
		this.codSeap = modalidadeEnsino.getCodSeap();
		this.atualizacaoSeap = modalidadeEnsino.getAtualizacaoSeap();
		this.statModalidadeEnsino = modalidadeEnsino.getStatModalidadeEnsino();
	}

}