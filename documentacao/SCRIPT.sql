
CREATE SEQUENCE SEQ_PAIS START WITH 1;

CREATE TABLE TB_PAIS(

    ID_PAIS NUMBER NOT NULL,
    NOME_PAIS VARCHAR2(255) NOT NULL,
    CODIGO_SISCOMEX NUMBER NOT NULL,
    CONSTRAINT TB_PAIS_ID_PK PRIMARY KEY(ID_PAIS),
    CONSTRAINT TB_PAIS_NOME_UN UNIQUE(NOME_PAIS),
    CONSTRAINT TB_PAIS_CODIGO_SISCOMEX_UN UNIQUE(CODIGO_SISCOMEX)

);

CREATE SEQUENCE SEQ_UNIDADE_FEDERATIVA START WITH 1;

CREATE TABLE TB_UNIDADE_FEDERATIVA(

    ID_UNIDADE_FEDERATIVA NUMBER NOT NULL,
    NOME_UNIDADE_FEDERATIVA VARCHAR2(255) NOT NULL,
    SIGLA_UNIDADE_FEDERATIVA CHAR(2) NOT NULL,
    CODIGO_IBGE NUMBER NOT NULL,
    ID_PAIS NUMBER NOT NULL,
    CONSTRAINT TB_UNIDADE_FEDERATIVA_ID_PK PRIMARY KEY(ID_UNIDADE_FEDERATIVA),
    CONSTRAINT TB_UNIDADE_FEDERATIVA_NOME_UN UNIQUE(NOME_UNIDADE_FEDERATIVA),
    CONSTRAINT TB_UNIDADE_FEDERATIVA_SIGLA_UN UNIQUE(SIGLA_UNIDADE_FEDERATIVA),
    CONSTRAINT TB_UNIDADE_FEDERATIVA_CODIGO_IBGE_UN UNIQUE(CODIGO_IBGE),
    CONSTRAINT TB_UNIDADE_FEDERATIVA_ID_PAIS_FK FOREIGN KEY(ID_PAIS) REFERENCES TB_PAIS(ID_PAIS)

);

CREATE SEQUENCE SEQ_CIDADE START WITH 1;

CREATE TABLE TB_CIDADE(

    ID_CIDADE NUMBER NOT NULL,
    NOME_CIDADE VARCHAR2(255) NOT NULL,
    ID_UNIDADE_FEDERATIVA NUMBER NOT NULL,
    CONSTRAINT TB_CIDADE_ID_PK PRIMARY KEY(ID_CIDADE),
    CONSTRAINT TB_CIDADE_ID_UNIDADE_FEDERATIVA_FK FOREIGN KEY(ID_UNIDADE_FEDERATIVA) REFERENCES TB_UNIDADE_FEDERATIVA(ID_UNIDADE_FEDERATIVA)

);






