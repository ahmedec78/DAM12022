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
                    if( tablero [i][j] != null){
                        tablero [i][j].pintarPieza();
                        System.out.println("");
                    }else{
                        System.out.println("   ");
                    }
                }else{
                    if( tablero [i][j] != null){
                        tablero [i][j].pintarPieza();
                    }else{
                        System.out.print("   ");
                    }
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
    public boolean hayPiezasEntre(Movimiento mov){
        boolean respuesta = false;
        if (mov.esVertical(mov) == true){
            int i;
            i = 0;
            do{
                if (tablero[mov.getPosInicial().getFila()+i][mov.getPosInicial().getColumna()] == null){
                    respuesta = false;
               }else{
                   respuesta = true;
               }
                i ++;
            }while (respuesta == false || i < Math.abs((mov.getPosFinal().getFila()) )  );
        }
        /*if (mov.esHorizontal(mov) == true){
            for (int i = mov.getPosInicial().getColumna(); i < mov.getPosFinal().getColumna(); i++) {
                if (tablero[mov.getPosInicial().getFila()][i] == null){
                    respuesta = false;
               }else{
                   respuesta = true;
               }
            }
        }*/
        if (mov.esHorizontal(mov) == true){
            int i;
            i = 0;
            do{
                if (tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()+i] == null){
                    respuesta = false;
               }else{
                   respuesta = true;
               }
                i ++;
            }while (respuesta == false || i < Math.abs((mov.getPosFinal().getFila()) )  );
        }
        /*if (mov.esDiagonal(mov) == true){
            for (int i = 1; i < Math.abs(mov.getPosFinal().getFila()-mov.getPosInicial().getFila()); i++ ) {
               if(tablero[mov.getPosInicial().getFila() + i][mov.getPosInicial().getColumna()+i] != null ) {
                   respuesta == false;
               }else{
                   respuesta == true;
               }
            }
        }*/
        if (mov.esDiagonal(mov) == true){
            int i;
            i = 0;
        do{
           
            if(tablero[mov.getPosInicial().getFila() + i][mov.getPosInicial().getColumna()+i] != null ) {
                respuesta = true;
            }else{
                respuesta = false;
            }
            i++; 
            } while(respuesta == false || i < Math.abs(mov.getPosFinal().getFila()-mov.getPosInicial().getFila()));
        }
        return respuesta;
    }
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

