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
public abstract class  Pieza {
    protected boolean color; //Si es true es blanco y es false negra.
    protected String nombre; 
    
public Pieza(){
    
}
public abstract boolean validoMovimiento (Movimiento mov);
public  void pintarPieza(){
   if(this.color == true){
        System.out.print(nombre+"b ");
    }else{
            System.out.print(nombre+"n ");
    }
}
public boolean getColor (){
    return color;
}
public String getNombre (){
    return nombre;
}
public void setColor(boolean color){
    this.color=color;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
@Override
public String toString(){
    return this.getClass().getSimpleName()+ "Pieza: "+this.nombre+" ¿La pieza es blanca? "+this.color;
}
}
