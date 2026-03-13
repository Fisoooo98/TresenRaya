package org.example.TresEnRaya;

public class Jugador {
    private String nombre;
    private char simbolo;

    Jugador(String nombre, char simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }
    public boolean hacerMovimiento(Tablero tablero,int fila,int columna) {
        return tablero.colocarMarca(columna,fila,simbolo);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
}
