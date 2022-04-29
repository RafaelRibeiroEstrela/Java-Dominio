package com.example.dominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
