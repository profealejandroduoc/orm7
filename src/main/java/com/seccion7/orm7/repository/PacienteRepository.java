package com.seccion7.orm7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seccion7.orm7.model.Paciente;


@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>  {
    
    List<Paciente> findAll();
}
