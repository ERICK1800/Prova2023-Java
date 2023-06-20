package com.fatec.empresa.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fatec.empresa.entities.Empresa;
import com.fatec.empresa.services.EmpresaService;

@RestController
@RequestMapping("empresas")
@CrossOrigin
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;
    
    @PostMapping
    public ResponseEntity<Empresa> serveEmpresa(@RequestBody Empresa empresa){
        Empresa newEmpresa = empresaService.save(empresa);

        URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(empresa.getId())
        .toUri();

        return ResponseEntity.created(location).body(newEmpresa);
    }
}
