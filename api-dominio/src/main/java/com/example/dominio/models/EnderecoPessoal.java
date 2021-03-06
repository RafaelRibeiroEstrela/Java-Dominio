package com.example.dominio.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ENDERECO_PESSOAL")
public class EnderecoPessoal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ENDERECO_PESSOAL")
	@SequenceGenerator(name = "SEQ_ENDERECO_PESSOAL", sequenceName = "SEQ_ENDERECO_PESSOAL", allocationSize = 1)
	@Column(name = "ID_ENDERECO_PESSOAL")
	private Long id;
	
	@Column(name = "CEP")
	private String cep;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "BAIRRO")
	private String bairro;
	
	@OneToOne
	@JoinColumn(name = "ID_CIDADE")
	private Cidade cidade;
	
	@OneToOne
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa pessoa;
	

	public EnderecoPessoal() {
		
	}


	public EnderecoPessoal(Long id, String cep, String endereco, String numero, String bairro, Cidade cidade,
			Pessoa pessoa) {
		super();
		this.id = id;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.pessoa = pessoa;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public Cidade getCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setEmpresa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnderecoPessoal other = (EnderecoPessoal) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "EnderecoEmpresarial [id=" + id + ", cep=" + cep + ", endereco=" + endereco + ", numero=" + numero
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", pessoa=" + pessoa + "]";
	}
	
	

	
	
	
}
