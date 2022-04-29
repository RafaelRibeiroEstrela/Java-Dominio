package com.example.dominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
