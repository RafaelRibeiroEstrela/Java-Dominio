package org.example.msdominio.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.msdominio.models.Banco;

@Data
@NoArgsConstructor
public class BancoDTO {

	private Long idenBanco;
	private String nomeBanco;
	private String siglBanco;
	private String numrBanco;
	private Long statBanco;
	private String documento;
	private String network;
	private String tipoPix;
	private String url;
	private String dataInicioOperacao;
	private String dataInicioPix;
	private String dataRegistro;
	private String dataAtualizacao;
	private String tipoBanco;
	private String ispb;

	public BancoDTO(Banco banco) {
		this.idenBanco = banco.getIdenBanco();
		this.nomeBanco = banco.getNomeBanco();
		this.siglBanco = banco.getSiglBanco();
		this.numrBanco = banco.getNumrBanco();
		this.statBanco = banco.getStatBanco();
		this.documento = banco.getDocumento();
		this.network = banco.getNetwork();
		this.tipoPix = banco.getTipoPix();
		this.url = banco.getUrl();
		this.dataInicioOperacao = banco.getDataInicioOperacao();
		this.dataInicioPix = banco.getDataInicioPix();
		this.dataRegistro = banco.getDataRegistro();
		this.dataAtualizacao = banco.getDataAtualizacao();
		this.tipoBanco = banco.getTipoBanco();
		this.ispb = banco.getIspb();
	}

}