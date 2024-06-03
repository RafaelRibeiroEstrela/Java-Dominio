package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.NivelFormacao;

import java.time.Instant;

@Data
@NoArgsConstructor
public class NivelFormacaoDTO {

	private Long idenNivelFormacao;
	private String nomeNivelFormacao;
	private String codgSeap;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;
	private Character flagExibeRecadastro;
	private Long numrOrdem;

	public NivelFormacaoDTO(NivelFormacao nivelFormacao) {
		this.idenNivelFormacao = nivelFormacao.getIdenNivelFormacao();
		this.nomeNivelFormacao = nivelFormacao.getNomeNivelFormacao();
		this.codgSeap = nivelFormacao.getCodgSeap();
		this.dataAtualizacao = nivelFormacao.getDataAtualizacao();
		this.dataImportacao = nivelFormacao.getDataImportacao();
		this.flagExibeRecadastro = nivelFormacao.getFlagExibeRecadastro();
		this.numrOrdem = nivelFormacao.getNumrOrdem();
	}
}