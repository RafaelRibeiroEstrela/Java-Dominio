package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoRacaCor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class TipoRacaCorDTO {

	private Long idenTipoRacaCor;
	private String descTipoRacaCor;
	private Long codgSeap;
	private Long statTipoRacaCor;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;

	public TipoRacaCorDTO(TipoRacaCor tipoRacaCor) {
		this.idenTipoRacaCor = tipoRacaCor.getIdenTipoRacaCor();
		this.descTipoRacaCor = tipoRacaCor.getDescTipoRacaCor();
		this.codgSeap = tipoRacaCor.getCodgSeap();
		this.statTipoRacaCor = tipoRacaCor.getStatTipoRacaCor();
		this.dataAtualizacao = tipoRacaCor.getDataAtualizacao();
		this.dataImportacao = tipoRacaCor.getDataImportacao();
	}
}