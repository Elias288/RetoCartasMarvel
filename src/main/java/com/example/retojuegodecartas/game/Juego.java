package com.example.retojuegodecartas.game;
import co.com.sofka.domain.generic.AggregateEvent;
import com.example.retojuegodecartas.game.entities.Jugador;
import com.example.retojuegodecartas.game.entities.Tablero;
import com.example.retojuegodecartas.game.events.JuegoCreated;
import com.example.retojuegodecartas.game.values.EstadoJuego;
import com.example.retojuegodecartas.game.values.JuegoId;
import com.example.retojuegodecartas.game.values.JugadorId;

import java.util.Set;

public class Juego extends AggregateEvent<JuegoId>{
    protected Tablero tablero;
    protected Set<Jugador> jugador;
    protected EstadoJuego estadoJuego;
    protected JugadorId ganador;

    public Juego(JuegoId juegoId, Tablero tablero, EstadoJuego estadoJuego){
        super(juegoId);
        appendChange(new JuegoCreated(tablero, estadoJuego)).apply();
    }


}
