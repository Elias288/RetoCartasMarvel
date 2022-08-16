package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.Identity;

public class JugadorId extends Identity {
    public JugadorId(){}

    public JugadorId(String jugadorId){
        super(jugadorId);
    }

    public static JugadorId of(String jugadorId){
        return new JugadorId(jugadorId);
    }
}
