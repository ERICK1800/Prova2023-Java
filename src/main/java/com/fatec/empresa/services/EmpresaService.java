package com.fatec.empresa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.empresa.entities.Empresa;
import com.fatec.empresa.repositories.EmpresaRepository;

@Service
public class EmpresaService {
    
    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
}
