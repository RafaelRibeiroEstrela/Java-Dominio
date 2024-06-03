package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.Uf;

import java.time.Instant;

@Data
@NoArgsConstructor
public class UfDTO {

	private Long idenUf;
	private String codgIbge;
	private String siglUf;
	private String nomeUf;
	private PaisDTO paisDTO;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;

	public UfDTO(Uf uf) {
		this.idenUf = uf.getIdenUf();
		this.codgIbge = uf.getCodgIbge();
		this.siglUf = uf.getSiglUf();
		this.nomeUf = uf.getNomeUf();
		this.paisDTO = new PaisDTO(uf.getPais());
		this.dataAtualizacao = uf.getDataAtualizacao();
		this.dataImportacao = uf.getDataImportacao();
	}
}
