package com.example.retojuegodecartas.game.entities;

import co.com.sofka.domain.generic.Entity;
import com.example.retojuegodecartas.game.values.CartasId;

public class Carta extends Entity<CartasId> {
    private String Poder;
    private Boolean EstaHabilitada;
    //private CartaMaestra cartaMaestra;

    public Carta(CartasId cartasId, String poder, Boolean estaHabilitada) {
        super(cartasId);
        Poder = poder;
        EstaHabilitada = estaHabilitada;
    }

    public String poder() {
        return Poder;
    }

    public void updatePoder(String poder) {
        Poder = poder;
    }

    public Boolean estaHabilitada() {
        return EstaHabilitada;
    }

    public void updateEstaHabilitada(Boolean estaHabilitada) {
        EstaHabilitada = estaHabilitada;
    }
}
