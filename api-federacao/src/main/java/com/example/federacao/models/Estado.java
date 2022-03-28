package com.example.federacao.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "TB_ESTADO")
public class Estado implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_ESTADO")
	private Long id;
	
	@NotEmpty(message = "NOME DO ESTADO É OBRIGATÓRIO")
	@Column(name = "NOME_ESTADO")
	private String nome;
	
	@NotEmpty(message = "SIGLA DA UNIDADE FEDERATIVA É OBRIGATÓRIO")
	@Column(name = "UNIDADE_FEDERATIVA")
	private String unidadeFederativa;
	
	public Estado() {
		
	}

	public Estado(Long id, String nome, String unidadeFederativa) {
		super();
		this.id = id;
		this.nome = nome;
		this.unidadeFederativa = unidadeFederativa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
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
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
