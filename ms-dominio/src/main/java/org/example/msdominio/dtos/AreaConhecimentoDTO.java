package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.AreaConhecimento;

import java.time.Instant;

@Data
@NoArgsConstructor
public class AreaConhecimentoDTO {

	private Long idenAreaConhecimento;
	private String descAreaConhecimento;
	private Long codgSeap;
	private Long statAreaConhecimento;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;

	public AreaConhecimentoDTO(AreaConhecimento areaConhecimento) {
		this.idenAreaConhecimento = areaConhecimento.getIdenAreaConhecimento();
		this.descAreaConhecimento = areaConhecimento.getDescAreaConhecimento();
		this.codgSeap = areaConhecimento.getCodgSeap();
		this.statAreaConhecimento = areaConhecimento.getStatAreaConhecimento();
		this.dataImportacao = areaConhecimento.getDataImportacao();
		this.dataAtualizacao = areaConhecimento.getDataAtualizacao();
	}

}