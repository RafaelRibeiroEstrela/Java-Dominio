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
@Table(name = "DOMINIO.TB_SETOR")
public class Setor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SETOR")
	@SequenceGenerator(name = "SEQ_SETOR", sequenceName = "DOMINIO.SEQ_SETOR", allocationSize = 1)
	@Column(name = "ID_SETOR")
	private Long id;
	
	@Column(name = "NOME_SETOR")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "ID_DEPARTAMENTO")
	private Departamento departamento;
	
	public Setor() {
		
	}

	public Setor(Long id, String nome, Departamento departamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.departamento = departamento;
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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
		Setor other = (Setor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Setor [id=" + id + ", nome=" + nome + ", departamento=" + departamento + "]";
	}
	
	
	
}
