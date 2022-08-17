package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Carta implements ValueObject<String> {

    private final String Poder;
    private final Boolean EstaHabilitada;

    public Carta(String poder, Boolean estaHabilitada) {
        Poder = poder;
        EstaHabilitada = estaHabilitada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(Poder, carta.Poder) && Objects.equals(EstaHabilitada, carta.EstaHabilitada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Poder, EstaHabilitada);
    }

    @Override
    public String value() {
        return toString();
    }

    @Override
    public String toString() {
        return "Carta{" +
                "Poder='" + Poder + '\'' +
                ", EstaHabilitada=" + EstaHabilitada +
                '}';
    }
}
