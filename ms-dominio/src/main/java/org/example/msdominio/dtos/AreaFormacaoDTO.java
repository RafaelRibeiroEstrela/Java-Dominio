package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.AreaFormacao;

import java.time.Instant;

@Data
@NoArgsConstructor
public class AreaFormacaoDTO {

	private Long idenAreaFormacao;
	private String descAreaFormacao;
	private Long codgSeap;
	private Long statAreaFormacao;
	private String siglAreaFormacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	private Character flagExibeRecadastro;

	public AreaFormacaoDTO(AreaFormacao areaFormacao) {
		this.idenAreaFormacao = areaFormacao.getIdenAreaFormacao();
		this.descAreaFormacao = areaFormacao.getDescAreaFormacao();
		this.codgSeap = areaFormacao.getCodgSeap();
		this.statAreaFormacao = areaFormacao.getStatAreaFormacao();
		this.siglAreaFormacao = areaFormacao.getSiglAreaFormacao();
		this.dataImportacao = areaFormacao.getDataImportacao();
		this.dataAtualizacao = areaFormacao.getDataAtualizacao();
		this.flagExibeRecadastro = areaFormacao.getFlagExibeRecadastro();
	}

}