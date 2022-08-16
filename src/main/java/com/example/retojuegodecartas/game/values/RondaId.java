package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.Identity;

public class RondaId extends Identity {
    public RondaId(){}

    public RondaId(String rondaId){
        super(rondaId);
    }

    public static RondaId of(String rondaId){
        return new RondaId(rondaId);
    }
}
