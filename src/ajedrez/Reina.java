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
public class Reina extends Pieza{
    public Reina(){
        
    }
    public Reina(boolean color){
        nombre = "Ra";
        this.color = color;
    }
    

    @Override
    public boolean validoMovimiento (Movimiento mov) {
        boolean respuesta = false;
        if((mov.esDiagonal(mov) == true)||(mov.esHorizontal(mov)== true)||(mov.esVertical(mov) == true)){
            respuesta = true;
        }
        return respuesta;
    }

   
   
}
