package com.example.dominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
