package com.example.retojuegodecartas.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public class Ronda implements ValueObject<String> {

    private final Set<JuegoId> idJugadores;
    private  final String numero;

    public Ronda(Set<JuegoId> idJugador, String numero) {
        this.idJugadores = idJugador;
        this.numero = numero;
    }

    @Override
    public String value() {
        return toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ronda ronda = (Ronda) o;
        return Objects.equals(idJugadores, ronda.idJugadores) && Objects.equals(numero, ronda.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJugadores, numero);
    }

    @Override
    public String toString() {
        return "Ronda{" +
                "idJugador=" + idJugadores +
                ", numero='" + numero + '\'' +
                '}';
    }
}
