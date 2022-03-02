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
public class Peon extends Pieza{
    public Peon(){
        
    }
    public Peon(boolean color){
        nombre = "P";
        this.color = color;
    }

    @Override
    //prueba
    public boolean validoMovimiento(Movimiento mov) {
       boolean respuesta = false;
       if (mov.esVertical(mov) == true || (mov.esDiagonal(mov) == true))
           respuesta = true;
       return respuesta;
    }

    
    
}
