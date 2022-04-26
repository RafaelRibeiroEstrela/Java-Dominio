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
@Table(name = "TB_DEPARTAMENTO")
public class Departamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DEPARTAMENTO")
	@SequenceGenerator(name = "SEQ_DEPARTAMENTO", sequenceName = "SEQ_DEPARTAMENTO", allocationSize = 1)
	@Column(name = "ID_DEPARTAMENTO")
	private Long id;
	
	@Column(name = "NOME_DEPARTAMENTO")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "ID_EMPRESA")
	private Empresa empresa;
	
	public Departamento() {
		
	}

	public Departamento(Long id, String nome, Empresa empresa) {
		super();
		this.id = id;
		this.nome = nome;
		this.empresa = empresa;
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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
		Departamento other = (Departamento) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + ", empresa=" + empresa + "]";
	}
	
	

}
