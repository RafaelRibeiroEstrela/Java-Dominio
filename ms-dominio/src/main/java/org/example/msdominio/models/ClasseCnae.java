package org.example.msdominio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOMTB_CLASSE_CNAE", schema = "DOMINIO")
@Getter
@Setter
public class ClasseCnae {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLASSE_CNAE")
    @SequenceGenerator(name = "SEQ_CLASSE_CNAE", sequenceName = "DOMINIO.DOMSQ_CLASSE_CNAE", allocationSize = 1, schema = "DOMINIO")
    @Column(name = "IDEN_CLASSE_CNAE")
    private Long idenClasseCnae;
    @Column(name = "CODG_CLASSE_CNAE")
    private String codgClasseCnae;
    @Column(name = "DESC_CLASSE_CNAE")
    private String descSubclasseCnae;
    @Column(name = "STAT_CLASSE_CNAE")
    private Long statSubclasseCnae;
    @ManyToOne
    @JoinColumn(name = "IDEN_GRUPO_CNAE")
    private GrupoCnae grupoCnae;
}
