package com.seccion.orm5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion.orm5.repository.PacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }
}
