package com.example.retojuegodecartas.game.entities;

import co.com.sofka.domain.generic.Entity;
import com.example.retojuegodecartas.game.values.Carta;
import com.example.retojuegodecartas.game.values.Ronda;
import com.example.retojuegodecartas.game.values.TableroId;

import java.util.Set;

public class Tablero extends Entity<TableroId> {
    private Ronda ronda;
    private String tiempo;
    private Set<Carta> cartas;

    public Tablero(TableroId entityId, Ronda ronda, String tiempo, Set<Carta> cartas) {
        super(entityId);
        ronda = ronda;
        this.tiempo = tiempo;
        this.cartas = cartas;
    }

    public Ronda ronda() {
        return ronda;
    }

    public void updateRonda(Ronda ronda) {
        ronda = ronda;
    }

    public String tiempo() {
        return tiempo;
    }

    public void updateTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Set<Carta> cartas() {
        return cartas;
    }

    public void updateCartas(Set<Carta> cartas) {
        this.cartas = cartas;
    }
}
