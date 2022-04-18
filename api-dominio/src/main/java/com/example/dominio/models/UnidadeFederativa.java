package com.example.dominio.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DOMINIO.TB_UNIDADE_FEDERATIVA")
public class UnidadeFederativa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_UNIDADE_FEDERATIVA")
	@SequenceGenerator(name = "SEQ_UNIDADE_FEDERATIVA", sequenceName = "DOMINIO.SEQ_UNIDADE_FEDERATIVA", allocationSize = 1)
	@Column(name = "ID_UNIDADE_FEDERATIVA")
	private Long id;
	
	@Column(name = "NOME_UNIDADE_FEDERATIVA")
	private String nome;
	
	@Column(name = "SIGLA_UNIDADE_FEDERATIVA")
	private String sigla;
	
	@Column(name = "CODIGO_IBGE")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "ID_PAIS")
	private Pais pais;
	
	public UnidadeFederativa() {
		
	}

	public UnidadeFederativa(Long id, String nome, String sigla, Long codigo, Pais pais) {
		super();
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
		this.codigo = codigo;
		this.pais = pais;
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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
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
		UnidadeFederativa other = (UnidadeFederativa) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "UnidadeFederativa [id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", codigo=" + codigo + ", pais="
				+ pais + "]";
	}
	
	
	
	
	
	

}
