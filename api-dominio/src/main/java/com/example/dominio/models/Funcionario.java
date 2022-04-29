package com.example.dominio.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_FUNCIONARIO")
public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FUNCIONARIO")
	@SequenceGenerator(name = "SEQ_FUNCIONARIO", sequenceName = "SEQ_FUNCIONARIO", allocationSize = 1)
	@Column(name = "ID_FUNCIONARIO")
	private Long id;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "DATA_INGRESSO")
	private LocalDate dataIngresso;
	
	@Column(name = "PIS_PASEP")
	private String ctps;
	
	@OneToOne
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa pessoa;
	
	@OneToOne
	@JoinColumn(name = "ID_CARGO")
	private Cargo cargo;
	
	@ManyToOne
	@JoinColumn(name = "ID_SETOR")
	private Setor setor;
	
	public Funcionario() {
		
	}

	public Funcionario(Long id, String matricula, LocalDate dataIngresso, String ctps, Pessoa pessoa, Setor setor, Cargo cargo) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.dataIngresso = dataIngresso;
		this.ctps = ctps;
		this.pessoa = pessoa;
		this.setor = setor;
		this.cargo = cargo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
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
		Funcionario other = (Funcionario) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", matricula=" + matricula + ", dataIngresso=" + dataIngresso + ", ctps="
				+ ctps + ", pessoa=" + pessoa + ", cargo=" + cargo + ", setor=" + setor + "]";
	}

	
	
	
	
	

}
