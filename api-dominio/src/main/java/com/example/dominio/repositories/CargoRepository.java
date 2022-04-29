package com.example.dominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.models.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long>{

}
