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
public class Rey extends Pieza{
    public Rey(){
        
    }
    public Rey(boolean color){
        nombre = "R";
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

    

    public boolean isColor() {
        return color;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
