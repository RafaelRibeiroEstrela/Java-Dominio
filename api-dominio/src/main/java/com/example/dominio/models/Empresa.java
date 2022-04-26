package com.example.dominio.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_EMPRESA")
public class Empresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPRESA")
	@SequenceGenerator(name = "SEQ_EMPRESA", sequenceName = "SEQ_EMPRESA", allocationSize = 1)
	@Column(name = "ID_EMPRESA")
	private Long id;
	
	@Column(name = "NOME_EMPRESA")
	private String nome;
	
	@Column(name = "CNPJ")
	private String cnpj;
	
	@Column(name = "DATA_ABERTURA")
	private LocalDate dataAbertura;
	
	public Empresa() {
		
	}

	public Empresa(Long id, String nome, String cnpj, LocalDate dataAbertura) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.dataAbertura = dataAbertura;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
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
		Empresa other = (Empresa) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", dataAbertura=" + dataAbertura + "]";
	}
	
	
	

}
