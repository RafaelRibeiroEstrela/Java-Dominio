package com.example.dominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
