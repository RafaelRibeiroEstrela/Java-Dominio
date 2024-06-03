package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.FormacaoContinuada;

import java.time.Instant;

@Data
@NoArgsConstructor
public class FormacaoContinuadaDTO {

	private Long idenFormacaoContinuada;
	private String nomeFormacaoContinuada;
	private String codgSeap;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant atualizacaoSeap;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;
	private Character flagExibeRecadastro;

	public FormacaoContinuadaDTO(FormacaoContinuada formacaoContinuada) {
		this.idenFormacaoContinuada = formacaoContinuada.getIdenFormacaoContinuada();
		this.nomeFormacaoContinuada = formacaoContinuada.getNomeFormacaoContinuada();
		this.codgSeap = formacaoContinuada.getCodgSeap();
		this.atualizacaoSeap = formacaoContinuada.getAtualizacaoSeap();
		this.dataImportacao = formacaoContinuada.getDataImportacao();
		this.flagExibeRecadastro = formacaoContinuada.getFlagExibeRecadastro();
	}

}