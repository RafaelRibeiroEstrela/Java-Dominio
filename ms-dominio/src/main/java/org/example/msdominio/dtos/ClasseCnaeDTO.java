package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.ClasseCnae;

@Data
@NoArgsConstructor
public class ClasseCnaeDTO {

	private Long idenClasseCnae;
	private String codgClasseCnae;
	private String descSubclasseCnae;
	private Long statSubclasseCnae;
	private GrupoCnaeDTO grupoCnae;

	public ClasseCnaeDTO(ClasseCnae classeCnae) {
		this.idenClasseCnae = classeCnae.getIdenClasseCnae();
		this.codgClasseCnae = classeCnae.getCodgClasseCnae();
		this.descSubclasseCnae = classeCnae.getDescSubclasseCnae();
		this.statSubclasseCnae = classeCnae.getStatSubclasseCnae();
		this.grupoCnae = new GrupoCnaeDTO(classeCnae.getGrupoCnae());
	}

}