package com.example.dominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.models.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{

}
