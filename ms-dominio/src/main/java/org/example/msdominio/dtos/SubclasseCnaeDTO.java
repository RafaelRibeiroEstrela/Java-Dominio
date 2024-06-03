package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.SubclasseCnae;

@Data
@NoArgsConstructor
public class SubclasseCnaeDTO {

	private Long idenSubclasseCnae;
	private String codgSubclasseCnae;
	private String descSubclasseCnae;
	private Long statSubclasseCnae;
	private ClasseCnaeDTO classeCnaeDTO;

	public SubclasseCnaeDTO(SubclasseCnae subclasseCnae) {
		this.idenSubclasseCnae = subclasseCnae.getIdenSubclasseCnae();
		this.codgSubclasseCnae = subclasseCnae.getCodgSubclasseCnae();
		this.descSubclasseCnae = subclasseCnae.getDescSubclasseCnae();
		this.statSubclasseCnae = subclasseCnae.getStatSubclasseCnae();
		this.classeCnaeDTO = new ClasseCnaeDTO(subclasseCnae.getClasseCnae());
	}
}