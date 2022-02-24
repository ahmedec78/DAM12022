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
            if(partida.getTurno() == true){
                System.out.println("Es el turno de las blancas");
            }else{
                System.out.println("Es el turno de las negras");
            }
            tablero.pintarTablero();
            System.out.println("Introduzca jugada, por favor");
            String jugada = l.nextLine();
            
        }while(finDePartida == false);
        
        
    }
    
}
