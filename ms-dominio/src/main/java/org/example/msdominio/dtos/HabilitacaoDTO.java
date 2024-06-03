package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.Habilitacao;

import java.time.Instant;

@Data
@NoArgsConstructor
public class HabilitacaoDTO {

	private Long idenHabilitacao;
	private String descHabilitacao;
	private String codgSeap;
	private Long statHabilitacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;
	private Long numrOrdem;

	public HabilitacaoDTO(Habilitacao habilitacao) {
		this.idenHabilitacao = habilitacao.getIdenHabilitacao();
		this.descHabilitacao = habilitacao.getDescHabilitacao();
		this.codgSeap = habilitacao.getCodgSeap();
		this.statHabilitacao = habilitacao.getStatHabilitacao();
		this.dataAtualizacao = habilitacao.getDataAtualizacao();
		this.dataImportacao = habilitacao.getDataImportacao();
		this.numrOrdem = habilitacao.getNumrOrdem();
	}

}