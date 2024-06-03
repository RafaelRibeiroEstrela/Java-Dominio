package org.example.msdominio.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.OrgaoDocumento;

import java.time.Instant;

@Data
@NoArgsConstructor
public class OrgaoDocumentoDTO {

	private Long idenOrgaoDocumento;
	private String descOrgaoDocumento;
	private String siglOrgaoDocumento;
	private Long statOrgaoDocumento;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	private Instant dataImportacao;
	private Character flagIdenticacaoProf;

	public OrgaoDocumentoDTO(OrgaoDocumento orgaoDocumento) {
		this.idenOrgaoDocumento = orgaoDocumento.getIdenOrgaoDocumento();
		this.descOrgaoDocumento = orgaoDocumento.getDescOrgaoDocumento();
		this.siglOrgaoDocumento = orgaoDocumento.getSiglOrgaoDocumento();
		this.statOrgaoDocumento = orgaoDocumento.getStatOrgaoDocumento();
		this.dataImportacao = orgaoDocumento.getDataImportacao();
		this.flagIdenticacaoProf = orgaoDocumento.getFlagIdenticacaoProf();
	}

}