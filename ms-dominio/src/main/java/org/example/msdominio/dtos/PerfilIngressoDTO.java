package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.PerfilIngresso;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class PerfilIngressoDTO {

	private Long idenPerfilIngresso;
	private String descPerfilIngresso;
	private Long statPerfilIngresso;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate dataImportacao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate dataAtualizacao;

	public PerfilIngressoDTO(PerfilIngresso perfilIngresso) {
		this.idenPerfilIngresso = perfilIngresso.getIdenPerfilIngresso();
		this.descPerfilIngresso = perfilIngresso.getDescPerfilIngresso();
		this.statPerfilIngresso = perfilIngresso.getStatPerfilIngresso();
		this.dataAtualizacao = perfilIngresso.getDataAtualizacao();
		this.dataImportacao = perfilIngresso.getDataImportacao();
	}

}