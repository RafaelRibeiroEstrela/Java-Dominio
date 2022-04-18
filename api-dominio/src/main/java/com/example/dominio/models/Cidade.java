package com.example.dominio.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DOMINIO.TB_CIDADE")
public class Cidade implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CIDADE")
	@SequenceGenerator(name = "SEQ_CIDADE", sequenceName = "DOMINIO.SEQ_CIDADE", allocationSize = 1)
	@Column(name = "ID_CIDADE")
	private Long id;
	
	@Column(name = "NOME_CIDADE")
	private String nome;
	
	@Column(name = "ID_UNIDADE_FEDERATIVA")
	private UnidadeFederativa uf;
	
	public Cidade() {
		
	}

	public Cidade(Long id, String nome, UnidadeFederativa uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
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

	public UnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
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
		Cidade other = (Cidade) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cidade [id=" + id + ", nome=" + nome + ", uf=" + uf + "]";
	}
	
	
	

}
