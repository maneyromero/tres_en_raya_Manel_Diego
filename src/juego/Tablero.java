/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Diego
 */
public class Tablero {
    public Casilla[][] tablero;

    public Tablero(Casilla[][] tablero) {
        this.tablero = tablero;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla[][] tablero) {
        this.tablero = tablero;
    }
    
    
}

