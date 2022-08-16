package com.example.retojuegodecartas.game.values;
import co.com.sofka.domain.generic.Identity;

public class JuegoId extends Identity{
    public JuegoId(){}

    public JuegoId(String uuid){
        super(uuid);
    }

    public static JuegoId of(String uuid){
        return new JuegoId(uuid);
    }
}
