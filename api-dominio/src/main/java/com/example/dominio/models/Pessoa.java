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
@Table(name = "TB_PESSOA")
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOA")
	@SequenceGenerator(name = "SEQ_PESSOA", sequenceName = "SEQ_PESSOA", allocationSize = 1)
	@Column(name = "ID_PESSOA")
	private Long id;
	
	@Column(name = "NOME_PESSOA")
	private String nome;
	
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "RG")
	private String rg;
	
	@Column(name = "DATA_NASCIMENTO")
	private LocalDate dataNascimento;
	
	@Column(name = "SEXO")
	private String sexo;
	
	public Pessoa() {
		
	}

	public Pessoa(Long id, String nome, String cpf, String rg, LocalDate dataNascimento, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento="
				+ dataNascimento + ", sexo=" + sexo + "]";
	}
	
	
	

}
