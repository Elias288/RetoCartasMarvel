package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoJuego implements ValueObject<EstadoJuegoType> {
    private final EstadoJuegoType value;

    public EstadoJuego(EstadoJuegoType value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public EstadoJuegoType value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoJuego that = (EstadoJuego) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
