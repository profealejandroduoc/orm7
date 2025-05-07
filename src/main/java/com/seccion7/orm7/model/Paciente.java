package com.seccion7.orm7.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//PERSISTENCIA
@Entity
@Table(name = "paciente")

//MANIPULAR OBJETOS
@Data
@NoArgsConstructor
@AllArgsConstructor
//
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 13, nullable = false, unique = true)
    private String rut;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String apellido;

    @Column(nullable = false)
    private LocalDate fecha_nacimiento;

    @Column(length = 250, nullable = false)
    private String correo;
}
