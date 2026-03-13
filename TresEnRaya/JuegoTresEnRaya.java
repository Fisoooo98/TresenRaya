package org.example.TresEnRaya;

import java.util.Scanner;

public class JuegoTresEnRaya {
    Tablero tablero;
    Jugador jugador1;
    Jugador jugador2;
    Jugador TurnoActual;

    static void main() {
        JuegoTresEnRaya juego = new JuegoTresEnRaya();
        juego.iniciarJuego();
    }


    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);
        jugador1 = new Jugador("jugador1", 'o');
        jugador2 = new Jugador("jugador2", 'x');
        tablero = new Tablero();
        int turno=0;
        int fila = 0;
        int columna = 0;

        //Rellenar Tablero
        tablero.rellenarTablero();

        while (!tablero.tableroLleno()){
            //Cambiamos turno
            cambiarTurno(turno);

            do{
                //Le pedimos al usuario que meta la columna y la fila
                System.out.println(TurnoActual.getNombre() + " introduce la fila y la columna donde quieres meter la ficha");
                fila = sc.nextInt();
                columna = sc.nextInt();
            }while(!TurnoActual.hacerMovimiento(tablero, fila, columna)); //Comprobamos que el movimiento ha sido válido

            //Imprimimos el tablero
            System.out.println(tablero);
            char ganador = tablero.verificarGanador();

            //Verificamos si ha ganado alguien
            if (ganador != '_') {
                System.out.println("Ha ganado: " + ganador);
                break;
            }

            //Pasamos de turno
            turno++;
        }
    }

    public void cambiarTurno(int turno) {
        Jugador turnoActual = TurnoActual;
        if (turno % 2 == 0) {
            TurnoActual = jugador2;
        } else {
            TurnoActual = jugador1;
        }
    }

}
