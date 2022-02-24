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
public class Caballo extends Pieza{
    
    public Caballo(){
        
    }
    public Caballo(boolean color){
        nombre="C";
        this.color = color;
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean respuesta = false;
        if(((mov.saltoVertical(mov)==(Math.abs(1)))&&(mov.saltoHorizontal(mov)==(Math.abs(2))))||((mov.saltoVertical(mov)==(Math.abs(2)))&&(mov.saltoHorizontal(mov)==(Math.abs(1))))){
            respuesta = true;
        }
        return respuesta;
    }

    
}
