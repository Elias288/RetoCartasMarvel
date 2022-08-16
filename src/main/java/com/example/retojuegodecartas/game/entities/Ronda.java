package com.example.retojuegodecartas.game.entities;

import co.com.sofka.domain.generic.Entity;
import com.example.retojuegodecartas.game.values.RondaId;

import java.util.Set;

public class Ronda extends Entity<RondaId> {
    private Set<Jugador> jugadores;
    private Integer numero;

    public Ronda(RondaId entityId, Set<Jugador> jugadores, Integer numero) {
        super(entityId);
        this.jugadores = jugadores;
        this.numero = numero;
    }

    public Set<Jugador> jugadores() {
        return jugadores;
    }

    public void updateJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Integer numero() {
        return numero;
    }

    public void updateNumero(Integer numero) {
        this.numero = numero;
    }
}
