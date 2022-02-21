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
        nombre = "Peon";
        this.color = color;
    }

    @Override
    //prueba
    public boolean validoMovimiento(Movimiento mov) {
       boolean respuesta = false;
       if (mov.esVertical(mov) == true)
           respuesta = true;
       return respuesta;
    }

    @Override
    public void pintarPieza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
