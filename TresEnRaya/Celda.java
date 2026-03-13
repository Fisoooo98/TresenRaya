package org.example.TresEnRaya;

public class Celda {
    private int fila;
    private int columna;
    private char simbolo;

    public Celda(int columna, int fila, char simbolo) {
        this.columna = columna;
        this.fila = fila;
        this.simbolo = simbolo;
    }

    public boolean estaVacia() {
        return simbolo == '_';
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
}
