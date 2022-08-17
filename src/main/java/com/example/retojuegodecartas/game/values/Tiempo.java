package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Tiempo implements ValueObject<Date> {

    private final Date value;

    public Tiempo(Date value) {
        this.value = value;
    }

    @Override
    public Date value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiempo tiempo = (Tiempo) o;
        return Objects.equals(value, tiempo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
