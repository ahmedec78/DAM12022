/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.Scanner;

/**
 *
 * @author ahmed
 */
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        Tablero tablero = new Tablero();
        tablero.pintarTablero();
        Juego partida = new Juego();
        
        boolean finDePartida = false;
        do{
            tablero.pintarTablero();
            partida.mostrarTurno();
            
            System.out.println("Introduzca jugada, por favor");
            String jugada = l.nextLine();
            partida.jugada(jugada, tablero);
            Movimiento mov =  partida.jugada(jugada, tablero);
            
            
            
            for (int i = 0; i < tablero.tablero.length; i++) {
                for (int j = 0; j < tablero.tablero.length; j++) {
                    
                    if(tablero.tablero[i][j].nombre != "R")
                        finDePartida=true;
                        
                }
                
                
            }
           partida.setTurno();
        }while(finDePartida == false);
        
        
    }
    
}
