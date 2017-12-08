/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Manel
 */
public class Casilla {
    public boolean inUse;
    public Jugador jugador;

    public Casilla(boolean inUse, Jugador jugador) {
        this.inUse = inUse;
        this.jugador = jugador;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return jugador.toString();
    }
    
    
}
