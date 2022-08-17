package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoRonda implements ValueObject<EstadoRondaType> {

    private final EstadoRondaType estado;

    public EstadoRonda(EstadoRondaType estado) {
        this.estado = estado;
    }

    @Override
    public EstadoRondaType value() {
        return estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoRonda that = (EstadoRonda) o;
        return estado == that.estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado);
    }
}
