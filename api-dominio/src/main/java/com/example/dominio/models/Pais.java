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
@Table(name = "DOMINIO.TB_PAIS")
public class Pais implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PAIS")
	@SequenceGenerator(name = "SEQ_PAIS", sequenceName = "DOMINIO.SEQ_PAIS", allocationSize = 1)
	@Column(name = "ID_PAIS")
	private Long id;
	
	@Column(name = "NOME_PAIS")
	private String nome;
	
	@Column(name = "CODIGO_SISCOMEX")
	private Long codigo;
	
	public Pais() {
		
	}

	public Pais(Long id, String nome, Long codigo) {
		super();
		this.id = id;
		this.nome = nome;
		this.codigo = codigo;
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

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
		Pais other = (Pais) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", codigo=" + codigo + "]";
	}
	
	

}
