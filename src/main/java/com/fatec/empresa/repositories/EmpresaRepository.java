package com.fatec.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.empresa.entities.Empresa;

public interface EmpresaRepository extends JpaRepository <Empresa, Integer>{
    
}
