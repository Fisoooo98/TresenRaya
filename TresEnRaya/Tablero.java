package org.example.TresEnRaya;

import java.util.Arrays;
import java.util.Objects;

public class Tablero {
    private Celda[][] tablero;

    public Tablero() {
        this.tablero = new Celda[3][3];
    }

    public void rellenarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                this.tablero[i][j] = new Celda(i, j, '_');
            }
        }
    }

    public boolean tableroLleno() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                if (this.tablero[i][j].getSimbolo() == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean colocarMarca(int col, int fila, char simbolo) {
        int f = fila - 1;
        int c = col - 1;

        if (f > 2 || f < 0 || c > 2 || c < 0) {
            return false;
        }


        if (this.tablero[f][c].getSimbolo() == '_') {
            this.tablero[f][c].setSimbolo(simbolo);
            return true;
        }else{
            return false;
        }
    }
    public char verificarGanador() {
        // comprobar filas
        for (int i = 0; i < 3; i++) {
            char s = tablero[i][0].getSimbolo();
            if (s != '_' && s == tablero[i][1].getSimbolo() && s == tablero[i][2].getSimbolo()) {
                return s;
            }
        }

        // comprobar columnas
        for (int j = 0; j < 3; j++) {
            char s = tablero[0][j].getSimbolo();
            if (s != '_' && s == tablero[1][j].getSimbolo() && s == tablero[2][j].getSimbolo()) {
                return s;
            }
        }

        // diagonal principal
        char s = tablero[0][0].getSimbolo();
        if (s != '_' && s == tablero[1][1].getSimbolo() && s == tablero[2][2].getSimbolo()) {
            return s;
        }

        // diagonal secundaria
        s = tablero[0][2].getSimbolo();
        if (s != '_' && s == tablero[1][1].getSimbolo() && s == tablero[2][0].getSimbolo()) {
            return s;
        }

        return '_';
    }

    public Celda[][] getTablero() {
        return tablero;
    }
    @Override
    public String toString() {
        String resultado = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado += " " + tablero[i][j].getSimbolo() + " ";
                if (j < 2) {
                    resultado += "|";
                }
            }
            resultado += "\n";
            if (i < 2) {
                resultado += "---+---+---\n";
            }
        }

        return resultado;
    }

}
