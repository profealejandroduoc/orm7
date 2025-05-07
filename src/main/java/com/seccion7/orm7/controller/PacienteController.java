package com.seccion7.orm7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion7.orm7.model.Paciente;
import com.seccion7.orm7.service.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Paciente>> getAll(){
        return new ResponseEntity<>(pacienteService.findAll(),HttpStatus.OK);
    }
    
}
