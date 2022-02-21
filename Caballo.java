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
        nombre="Caballo";
        this.color = color;
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean respuesta = false;
        if(((mov.saltoVertical(mov)==1)&&(mov.saltoHorizontal(mov)==2))||((mov.saltoVertical(mov)==2)&&(mov.saltoHorizontal(mov)==1))){
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public void pintarPieza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
