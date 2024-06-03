package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.Cidade;

import java.time.Instant;

@Data
@NoArgsConstructor
public class CidadeDTO {

	private Long idenCidade;
	private String codgIbge;
	private String siglCidade;
	private String nomeCidade;
	private UfDTO uF;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;
	private String chaveBusca;

	public CidadeDTO(Cidade cidade) {
		this.idenCidade = cidade.getIdenCidade();
		this.codgIbge = cidade.getCodgIbge();
		this.siglCidade = cidade.getSiglCidade();
		this.nomeCidade = cidade.getNomeCidade();
		this.uF = new UfDTO(cidade.getUF());
		this.dataAtualizacao = cidade.getDataAtualizacao();
		this.dataImportacao = cidade.getDataImportacao();
		this.chaveBusca = cidade.getChaveBusca();
	}
}