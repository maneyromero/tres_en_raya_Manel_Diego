/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Manel
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Variables
        int turno = 0;
        int fila;
        int columna;

        //Juego
        Jugador j1 = new Jugador("X", "Diego");
        Jugador j2 = new Jugador("O", "Manel");
        Jugador jVacio = new Jugador("-", "");
        Jugador jugadorActual = new Jugador("", "");

        Casilla auxCasilla = new Casilla(false, jVacio);
        Casilla[][] casillas = new Casilla[3][3];
        Tablero t1 = new Tablero(casillas);

    }  
}
