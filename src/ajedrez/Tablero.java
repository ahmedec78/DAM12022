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
    public void pintarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if( j == 7){
                    System.out.print(tablero[i][j]); //esto hay que modificarlo
                }else{
                    System.out.println(tablero[i][j]); // esto hay que modificarlo es solo una idea
                }
                
            }
            
        }
    }
    public boolean hayPieza(int columna, int fila){
        boolean respuesta = false;
        if (tablero [fila][columna].nombre != null){
            respuesta = true;
        }
        return respuesta;
    }
    public boolean hayPieza(Posicion pos){
        boolean respuesta = false;
        if (tablero [pos.getFila()][pos.getColumna()].nombre != null){
            respuesta = true;
        }
        return respuesta;
    }
    //en este metodo hay que tener en cuenta si se va a sumar casillas o se van a borrar, teniendo en cuenta el color de la pieza que se va a mover
    //ademas esto no tengo que hacerlo todavia, tambien tengo que utilizar el metodo de arriba haypieza
    /*public boolean hayPiezasEntre(Movimiento mov){
        boolean respuesta = false;
        if (mov.esVertical(mov) == true){
            for (int i = mov.getPosInicial().getFila(); i < mov.getPosFinal().getFila(); i++) {
               if (tablero[i][mov.getPosInicial().getColumna()] == null){
                   respuesta = false;
               }else{
                   respuesta = true;
               }
            }
        }
        if (mov.esHorizontal(mov) == true){
            for (int i = mov.getPosInicial().getColumna(); i < mov.getPosFinal().getColumna(); i++) {
                if (tablero[mov.getPosInicial().getFila()][i] == null){
                    respuesta = false;
               }else{
                   respuesta = true;
               }
            }
        }
        if (mov.esDiagonal(mov) == true){
            
        }
        return respuesta;
    }*****/
    public void ponPieza( Pieza figura, int fila, int columna){
        if(this.hayPieza(fila, columna) == true){
            System.out.println("Lo siento, en esta casilla ya hay un a pieza");
        }else{
        tablero [fila][columna]=figura;
        }
    }
    public void ponPieza ( Pieza figura, Posicion pos){
        if(this.hayPieza(pos.getFila(), pos.getColumna()) == true){
            System.out.println("Lo siento, en esta casilla ya hay un a pieza");
        }else{
        tablero[pos.getFila()][pos.getColumna()] = figura;
        }
    }
    public void quitaPieza (Posicion pos){
        tablero[pos.getFila()][pos.getColumna()] = null;
    }
    public void quitaPieza (int fila, int columna){
        tablero[fila][columna] = null;
    }
    public Pieza devuelvePieza (Posicion pos){
        return tablero [pos.getFila()][pos.getColumna()];
    }
    public Pieza devuelvePieza (int fila, int columna){
        return tablero [fila][columna];
    }
    }

