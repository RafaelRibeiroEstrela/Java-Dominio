package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.EstadoCivil;

import java.time.Instant;


@Data
@NoArgsConstructor
public class EstadoCivilDTO {

	private Long idenEstadoCivil;
	private String descEstadoCivil;
	private String codgSeap;
	private Long statEstadoCivil;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;

	public EstadoCivilDTO(EstadoCivil estadoCivil) {
		this.idenEstadoCivil = estadoCivil.getIdenEstadoCivil();
		this.descEstadoCivil = estadoCivil.getDescEstadoCivil();
		this.codgSeap = estadoCivil.getCodgSeap();
		this.statEstadoCivil = estadoCivil.getStatEstadoCivil();
		this.dataAtualizacao = estadoCivil.getDataAtualizacao();
		this.dataImportacao = estadoCivil.getDataImportacao();
	}
}