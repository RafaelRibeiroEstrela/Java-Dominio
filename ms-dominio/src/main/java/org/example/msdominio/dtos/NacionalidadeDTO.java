package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.Nacionalidade;

import java.time.Instant;

@Data
@NoArgsConstructor
public class NacionalidadeDTO {

	private Long idenNacionalidade;
	private String descNacionalidade;
	private Long codgSeap;
	private Long statNacionalidade;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;

	public NacionalidadeDTO(Nacionalidade nacionalidade) {
		this.idenNacionalidade = nacionalidade.getIdenNacionalidade();
		this.descNacionalidade = nacionalidade.getDescNacionalidade();
		this.codgSeap = nacionalidade.getCodgSeap();
		this.statNacionalidade = nacionalidade.getStatNacionalidade();
		this.dataAtualizacao = nacionalidade.getDataAtualizacao();
		this.dataImportacao = nacionalidade.getDataImportacao();
	}

}