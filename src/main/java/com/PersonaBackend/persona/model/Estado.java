package com.PersonaBackend.persona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estado")
public class Estado {
    private int id;
    private Pais pais;
    private String nombre;

}
