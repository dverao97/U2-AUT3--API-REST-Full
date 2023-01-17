package com.edu.proyect.persona.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column (name="clave")
    private String clave;
    @Column (name="email")
    private String email;
    @Column (name="estado")
    private Boolean estado;
}
