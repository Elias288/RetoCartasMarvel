package com.example.retojuegodecartas.game.values;
import co.com.sofka.domain.generic.Identity;

public class UsuarioId extends Identity{
    public UsuarioId(){}

    public UsuarioId(String uuid){
        super(uuid);
    }

    public static UsuarioId of(String uuid){
        return new UsuarioId(uuid);
    }
}
