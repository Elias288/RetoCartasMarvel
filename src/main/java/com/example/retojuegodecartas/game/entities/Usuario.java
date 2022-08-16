package com.example.retojuegodecartas.game.entities;

import co.com.sofka.domain.generic.Entity;
import com.example.retojuegodecartas.game.values.UsuarioId;

public class Usuario extends Entity<UsuarioId> {
    private String email;
    private String nombre;

    public Usuario(UsuarioId entityId, String email, String nombre) {
        super(entityId);
        this.email = email;
        this.nombre = nombre;
    }

    public String email() {
        return email;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void updateNombre(String nombre) {
        this.nombre = nombre;
    }
}
