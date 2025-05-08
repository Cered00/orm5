package com.seccion.orm5.controller;

import org.springframework.web.bind.annotation.RestController;

import com.seccion.orm5.model.Paciente;
import com.seccion.orm5.service.PacienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/paciente")
public class requestMethodName(@RequestParam String param) {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Paciente>> getPacientes(){
        List<Paciente> pacientes=pacienteService.findAll();
        if (pacientes.isEmpty()){
            return new ResponseEntity<>(HttpStatus)
            
        }

        return new ResponseEntity<>(pacienteService.findAll(),HttpStatus.com);

    }
    
}
    

