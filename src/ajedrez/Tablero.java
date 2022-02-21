/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author ahmed
 */
public class Tablero {
     
    Pieza tablero [][] =  new Pieza [8][8];
    
    public Tablero (){
        //False por que son las piezas negras
        tablero [0][0] = new Torre(false);
        tablero [0][1] = new Caballo(false);
        tablero [0][2] = new Alfil(false);
        tablero [0][3] = new Reina(false);
        tablero [0][4] = new Rey(false);
        tablero [0][5] = new Alfil(false);
        tablero [0][6] = new Caballo(false);
        tablero [0][7] = new Torre(false);
        tablero [1][0] = new Peon(false);
        tablero [1][1] = new Peon(false);
        tablero [1][2] = new Peon(false);
        tablero [1][3] = new Peon(false);
        tablero [1][4] = new Peon(false);
        tablero [1][5] = new Peon(false);
        tablero [1][6] = new Peon(false);
        tablero [1][7] = new Peon(false);
        //Ahora toca pintar las piezas blancas
        tablero[7][0] = new Torre(true);
        tablero[7][1] = new Caballo(true);
        tablero[7][2] = new Alfil(true);
        tablero[7][3] = new Rey(true);
        tablero[7][4] = new Reina(true);
        tablero[7][5] = new Alfil(true);
        tablero[7][6] = new Caballo(true);
        tablero[7][7] = new Torre(true);
        tablero [6][0]= new Peon(true);
        tablero [6][1]= new Peon(true);
        tablero [6][2]= new Peon(true);
        tablero [6][3]= new Peon(true);
        tablero [6][4]= new Peon(true);
        tablero [6][5]= new Peon(true);
        tablero [6][6]= new Peon(true);
        tablero [6][7]= new Peon(true);
        //el resto del tablero es nulo
        
     
    }
    
}
