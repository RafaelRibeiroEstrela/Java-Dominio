package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.GrupoSanguineo;

import java.time.Instant;

@Data
@NoArgsConstructor
public class GrupoSanguineoDTO {

	private Long idenGrupoSanguineo;
	private String descGrupoSanguineo;
	private String codgSeap;
	private Long statGrupoSanguineo;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataAtualizacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Instant dataImportacao;

	public GrupoSanguineoDTO(GrupoSanguineo grupoSanguineo) {
		this.idenGrupoSanguineo = grupoSanguineo.getIdenGrupoSanguineo();
		this.descGrupoSanguineo = grupoSanguineo.getDescGrupoSanguineo();
		this.codgSeap = grupoSanguineo.getCodgSeap();
		this.dataAtualizacao = grupoSanguineo.getDataAtualizacao();
		this.dataImportacao = grupoSanguineo.getDataImportacao();
	}
}