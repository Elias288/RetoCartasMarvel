package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.ValueObject;
import com.example.retojuegodecartas.game.entities.Carta;

import java.util.Objects;
import java.util.Set;

public class Mazo implements ValueObject<Set<Carta>> {
    private final Set<Carta> value;

    public Mazo(Set<Carta> cartas) {
        this.value = cartas;
    }

    @Override
    public Set<Carta> value(){
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mazo mazo = (Mazo) o;
        return Objects.equals(value, mazo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
