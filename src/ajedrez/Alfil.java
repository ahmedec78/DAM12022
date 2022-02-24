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
public class Alfil extends Pieza{
    public Alfil(){
    
    }
    public Alfil(boolean color){
        nombre="A";
        this.color = color;
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
       boolean respuesta = false;
       if ( mov.esDiagonal(mov) == true ){
           respuesta = true;
       }
       return respuesta;
    }

    
}
