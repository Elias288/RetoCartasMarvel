package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.Identity;

public class CartasId extends Identity {
    public CartasId(){}

    public CartasId(String cartasId){
        super(cartasId);
    }

    public static CartasId of(String cartasId){
        return new CartasId(cartasId);
    }
}
