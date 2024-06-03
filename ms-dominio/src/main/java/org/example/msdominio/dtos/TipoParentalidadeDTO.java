package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoParentalidade;

import java.time.Instant;

@Data
@NoArgsConstructor
public class TipoParentalidadeDTO {

	private Long idenTipoParentalidade;
	private String descTipoParentalidade;
	private String codgSeap;
	private Long statTipoParentalidade;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;

	public TipoParentalidadeDTO(TipoParentalidade tipoParentalidade) {
		this.idenTipoParentalidade = tipoParentalidade.getIdenTipoParentalidade();
		this.descTipoParentalidade = tipoParentalidade.getDescTipoParentalidade();
		this.codgSeap = tipoParentalidade.getCodgSeap();
		this.statTipoParentalidade = tipoParentalidade.getStatTipoParentalidade();
		this.dataAtualizacao = tipoParentalidade.getDataAtualizacao();
		this.dataImportacao = tipoParentalidade.getDataImportacao();
	}

}