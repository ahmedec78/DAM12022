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
public class Posicion {
    private int fila;
    private int columna;
    
    public Posicion (){
        
    }
    public int getFila(){
        return fila;
    }
    public int getColumna(){
        return columna;
    }
    public void setFila(int fila){
        this.fila=fila;
    }
    public void setColumna(int columna){
        this.columna=columna;
    }
    @Override
    public String toString (){
        return " Fila: " + fila + " Columna: "+columna;
    }
}
