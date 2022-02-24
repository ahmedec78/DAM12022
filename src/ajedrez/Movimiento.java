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
public class Movimiento {
    
    private Posicion posInicial;
    private Posicion posFinal;
    
    public Movimiento(){
        
    }
    public Movimiento (Posicion posInicial, Posicion posFinal){
        this.posInicial=posInicial;
        this.posFinal=posFinal;
    }
    public boolean esVertical(Movimiento mov){
        boolean respuesta = false;
        if ((this.posInicial.getColumna()==this.posFinal.getColumna())&&(this.posInicial.getFila()!=this.posFinal.getFila())){
            respuesta=true;
        }
        return respuesta;
     }
    public boolean esHorizontal(Movimiento mov){
        boolean respuesta = false;
        if((this.posInicial.getColumna()!=this.posFinal.getColumna())&&(this.posInicial.getFila()==this.posFinal.getFila())){
            respuesta=true;
        }
        return respuesta;
     }
    public boolean esDiagonal(Movimiento mov){
        boolean respuesta = false;
        int movVertical, movHorizontal; //en estas variables almaceno cuanto se han movido en horizontal y en vertical
        movVertical = ((this.posInicial.getFila())-(this.posFinal.getFila()));
        movHorizontal = ((this.posInicial.getColumna())-(this.posFinal.getColumna()));
        if (Math.abs(movVertical) == Math.abs(movHorizontal)){
            respuesta=true;
        }
        return respuesta;
    }
    public int saltoHorizontal(Movimiento mov){
        int salto;
        salto = this.posInicial.getColumna() - this.posFinal.getColumna();
        return Math.abs(salto);
    }
    public int saltoVertical (Movimiento mov){
        int salto;
        salto = this.posInicial.getFila() - this.posFinal.getFila();
        return Math.abs(salto);
    }

    public Posicion getPosInicial() {
        return posInicial;
    }

    public Posicion getPosFinal() {
        return posFinal;
    }
    
    @Override
    public String toString(){
        return posInicial + " " + posFinal;
    }
}
