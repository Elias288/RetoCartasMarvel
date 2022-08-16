package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.Identity;

public class TableroId extends Identity {
    public TableroId(){}

    public TableroId(String tableroId){
        super(tableroId);
    }

    public static TableroId of(String tableroId){
        return new TableroId(tableroId);
    }
}
