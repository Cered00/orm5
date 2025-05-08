package com.seccion.orm5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seccion.orm5.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

    List<Paciente> findall();

}
