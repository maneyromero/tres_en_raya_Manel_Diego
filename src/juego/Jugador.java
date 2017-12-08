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
public class Jugador {
   public String ficha;
   public String nombre;

    public Jugador(String ficha, String nombre) {
        this.ficha = ficha;
        this.nombre = nombre;
    }

    public Jugador() {
    }

    public String getFicha() {
        return ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return ficha;
    }
   
    
}
