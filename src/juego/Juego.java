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

        crearTablero(jVacio, t1, casillas, auxCasilla);

        mostrarTablero(t1, casillas);

        while (turno <= 9) {

            do {
                if (turno % 2 == 0) {
                    jugadorActual = j1;
                } else {
                    jugadorActual = j2;
                }

                System.out.println("El turno es de: " + jugadorActual.getNombre());
                System.out.println("Introduce fila: 0, 1 o 2");
                fila = Integer.parseInt(br.readLine());
                System.out.println("Introduce columna: 0, 1 o 2");
                columna = Integer.parseInt(br.readLine());

            } while (comprobarPosicion(casillas, fila, columna) == false);

            insertarFicha(t1, casillas, auxCasilla, fila, columna, jugadorActual);
            mostrarTablero(t1, casillas);
            if (ganador(casillas, jugadorActual) == true) {
                System.out.println("El ganador es: " + jugadorActual.getNombre());
                break;
            }
            turno++;
        }

    }

    public static void crearTablero(Jugador jVacio, Tablero t1, Casilla[][] casillas, Casilla auxCasilla) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                auxCasilla.setJugador(jVacio);
                casillas[i][j] = auxCasilla;
                t1.setTablero(casillas);
            }
        }
    }

    public static void mostrarTablero(Tablero t1, Casilla[][] casillas) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(casillas[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static boolean comprobarPosicion(Casilla[][] casillas, int fila, int columna) {

        boolean enUso = false;
        if (fila > 2 || columna > 2) {
            System.out.println("Esa casilla no existe");

        } else if (casillas[fila][columna].isInUse() == true) {
            System.out.println("Esa casilla ya esta en uso");
        } else {
            enUso = true;
        }
        return enUso;
    }

    public static void insertarFicha(Tablero t1, Casilla[][] casillas, Casilla auxCasilla, int fila, int columna, Jugador jugadorActual) {

        auxCasilla.setInUse(true);
        auxCasilla.setJugador(jugadorActual);
        casillas[fila][columna] = auxCasilla;
        t1.setTablero(casillas);

    }

    public static boolean ganador(Casilla casillas[][], Jugador jugadorActual) {

        boolean ganador = false;

        if (casillas[0][0].getJugador() == jugadorActual
                && casillas[0][1].getJugador() == jugadorActual
                && casillas[0][2].getJugador() == jugadorActual) {
            ganador = true;
        } else if (casillas[1][0].getJugador() == jugadorActual
                && casillas[1][1].getJugador() == jugadorActual
                && casillas[1][2].getJugador() == jugadorActual) {
            ganador = true;
        } else if (casillas[2][0].getJugador() == jugadorActual
                && casillas[2][1].getJugador() == jugadorActual
                && casillas[2][2].getJugador() == jugadorActual) {
            ganador = true;
        } else if (casillas[0][0].getJugador() == jugadorActual
                && casillas[1][0].getJugador() == jugadorActual
                && casillas[2][0].getJugador() == jugadorActual) {
            ganador = true;
        } else if (casillas[0][1].getJugador() == jugadorActual
                && casillas[1][1].getJugador() == jugadorActual
                && casillas[2][1].getJugador() == jugadorActual) {
            ganador = true;
        } else if (casillas[0][2].getJugador() == jugadorActual
                && casillas[1][2].getJugador() == jugadorActual
                && casillas[2][2].getJugador() == jugadorActual) {
            ganador = true;
        } else if (casillas[0][0].getJugador() == jugadorActual
                && casillas[1][1].getJugador() == jugadorActual
                && casillas[2][2].getJugador() == jugadorActual) {
            ganador = true;
        } else if (casillas[0][2].getJugador() == jugadorActual
                && casillas[1][1].getJugador() == jugadorActual
                && casillas[2][0].getJugador() == jugadorActual) {
            ganador = true;
        }

        return ganador;
    }
}
