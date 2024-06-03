package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.Escolaridade;

import java.time.Instant;

@Data
@NoArgsConstructor
public class EscolaridadeDTO {

	private Long idenEscolaridade;
	private String nomeEscolaridade;
	private String codgSeap;
	private String flagExibeRecadastro;
	private Long numrOrdem;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant atualizacaoSeap;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;

	public EscolaridadeDTO(Escolaridade escolaridade) {
		this.idenEscolaridade = escolaridade.getIdenEscolaridade();
		this.nomeEscolaridade = escolaridade.getNomeEscolaridade();
		this.codgSeap = escolaridade.getCodgSeap();
		this.numrOrdem = escolaridade.getNumrOrdem();
		this.atualizacaoSeap = escolaridade.getAtualizacaoSeap();
		this.dataAtualizacao = escolaridade.getDataAtualizacao();
		this.dataImportacao = escolaridade.getDataImportacao();
	}

}