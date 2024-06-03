package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "DOMTB_PERFIL_INGRESSO", schema = "DOMINIO")
@Getter
@Setter
public class PerfilIngresso {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERFIL_INGRESSO")
	@SequenceGenerator(name = "SEQ_PERFIL_INGRESSO", sequenceName = "DOMSQ_PERFIL_INGRESSO", allocationSize = 1, schema = "DOMINIO")
	@Column(name = "IDEN_PERFIL_INGRESSO")
	private Long idenPerfilIngresso;

	@Column(name = "DESC_PERFIL_INGRESSO")
	private String descPerfilIngresso;

	@Column(name = "STAT_PERFIL_INGRESSO")
	private Long statPerfilIngresso;

	@Column(name = "DATA_IMPORTACAO")
	private LocalDate dataImportacao;

	@Column(name = "DATA_ATUALIZACAO")
	private LocalDate dataAtualizacao;

}
