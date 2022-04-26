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
@Table(name = "TB_CARGO")
public class Cargo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CARGO")
	@SequenceGenerator(name = "SEQ_CARGO", sequenceName = "SEQ_CARGO", allocationSize = 1)
	@Column(name = "ID_CARGO")
	private Long id;
	
	@Column(name = "NOME_CARGO")
	private String nome;
	
	@Column(name = "SALARIO")
	private Double salario;
	
	public Cargo() {
		
	}

	public Cargo(Long id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
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
		Cargo other = (Cargo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cargo [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	

}
