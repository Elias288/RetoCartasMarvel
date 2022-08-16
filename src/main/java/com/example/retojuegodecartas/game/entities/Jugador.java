package com.example.retojuegodecartas.game.entities;

import co.com.sofka.domain.generic.Entity;
import com.example.retojuegodecartas.game.values.JugadorId;
import com.example.retojuegodecartas.game.values.Mazo;

public class Jugador extends Entity<JugadorId> {
    private Usuario usuario;
    private String alias;
    private Integer puntos;
    private Mazo mazo;

    public Jugador(JugadorId entityId, Usuario usuario, String alias, Integer puntos, Mazo mazo) {
        super(entityId);
        this.usuario = usuario;
        this.alias = alias;
        this.puntos = puntos;
        this.mazo = mazo;
    }

    public Usuario usuario() {
        return usuario;
    }

    public void updateUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String alias() {
        return alias;
    }

    public void updateAlias(String alias) {
        this.alias = alias;
    }

    public Integer puntos() {
        return puntos;
    }

    public void updatePuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Mazo mazo() {
        return mazo;
    }

    public void updateMazo(Mazo mazo) {
        this.mazo = mazo;
    }
}
