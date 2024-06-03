package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.TipoDeficiencia;

import java.time.Instant;

@Data
@NoArgsConstructor
public class TipoDeficienciaDTO {

	private Long idenTipoDeficiencia;
	private String descTipoDeficiencia;
	private Long statTipoDeficiencia;
	private String codgSeap;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant atualizacaoSeap;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;

	public TipoDeficienciaDTO(TipoDeficiencia tipoDeficiencia) {
		this.idenTipoDeficiencia = tipoDeficiencia.getIdenTipoDeficiencia();
		this.codgSeap = tipoDeficiencia.getCodgSeap();
		this.statTipoDeficiencia = tipoDeficiencia.getStatTipoDeficiencia();
		this.atualizacaoSeap = tipoDeficiencia.getAtualizacaoSeap();
		this.dataAtualizacao = tipoDeficiencia.getDataAtualizacao();
		this.dataImportacao = tipoDeficiencia.getDataImportacao();
	}

}