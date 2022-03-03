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
public class Juego {
    private boolean elTurno; //0->false->negras    1->Blancas->true
    public boolean getTurno(){
        return elTurno;
    }
        public void setTurno(){
            //si el turno es false, que cambie a verdadero, y si no lo es pues que cambie a falso.
            
           if( elTurno == false){
               elTurno = true;
           }else{
               elTurno = false;
           }
        }
        //Este metodo te imprime de quien es el turno
        public void mostrarTurno (){
        if  (elTurno == false){
            System.out.println("Turno de blancas");
        }else{
            System.out.println("Turno de negras");
        }
    }
        public void inicializar (Tablero tablero){
            
        }
        public void pintar(Tablero tablero){}
        public Movimiento jugada (String jugada, Tablero tablero){
            Movimiento mov = null;
            if(jugada.length() == 4){
                jugada = jugada.toUpperCase();//Transformo todos el String en mayusculas para simplificar el movimiento
                if(jugada.charAt(0)>= 'A' && jugada.charAt(0)<='H'){
                    if(jugada.charAt(1)>='1' && jugada.charAt(1)<='8'){
                        if(jugada.charAt(2)>='A' && jugada.charAt(2)<='H'){
                            if(jugada.charAt(1)>= '1' && jugada.charAt(1)<='8'){
                                //creo variables auxiliares que me permitan crear un movimiento de manera mas sencilla
                                int filaInicial = jugada.charAt(0)-'A';
                                int columnaInicial = jugada.charAt(1)-'1';
                                int filaFinal = jugada.charAt(2)-'A';
                                int columnaFinal = jugada.charAt(3)-'1';
                                //compruebo que la ficha que sea del jugador al que le toca, y que la casilla inicial no este vacia
                                if(tablero.tablero[filaInicial][columnaInicial]!=null && tablero.tablero[filaInicial][columnaInicial].getColor()==this.getTurno()){
                                    //Ahora en la siguiente sentencia comprueba que la casilla final este vacia o que tenga una ficha que se pueda comer y no una aliada.
                                    if(tablero.tablero[filaFinal][columnaFinal] != null && (tablero.tablero[filaFinal][columnaFinal].getColor()!=this.getTurno() || tablero.tablero[filaFinal][columnaFinal]== null)){
                                        //asigno ya valores al movimiento
                                        Posicion posInicial = new Posicion(filaInicial, columnaInicial);
                                        Posicion posFinal = new Posicion(filaFinal, columnaFinal);
                                        mov = new Movimiento (posInicial,posFinal);
                                    }else{ 
                                           System.out.println("Movimiento no válido");
                                    }
                                    }else{ 
                                        System.out.println("Error en el cuarto caracter");
                                }}else{
                                    System.out.println("Error en el tercer caracter");
                           }
                        }else{
                            System.out.println("Error en el segundo caracter");
                        }
                }else{
                        System.out.println("Error en el primer caracter");
                    }
            }
        }
            return mov;
        }
        //Este metodo mueve la pieza de una casilla a otra, con la ayuda de una variable auxiliar.
        public void moverJuego (Movimiento mov, Tablero tablero){
            String figura = new String();
            figura = tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()].getClass().getSimpleName();
            Pieza auxiliar;
            switch (figura){
                case "Rey":
                    auxiliar = new Rey();
                    auxiliar = tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
                    tablero [mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = auxiliar;
                    tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()] = null;
                break;
                case "Reina":
                    auxiliar = new Reina();
                    auxiliar = tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
                    tablero [mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = auxiliar;
                    tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()] = null;
                break;
                case "Alfil":
                    auxiliar = new Alfil();
                    auxiliar = tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
                    tablero [mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = auxiliar;
                    tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()] = null;
                break;   
                case "Torre":
                    auxiliar = new Torre();
                    auxiliar = tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
                    tablero [mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = auxiliar;
                    tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()] = null;
                break;
                case "Caballo":
                    auxiliar = new Caballo();
                    auxiliar = tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
                    tablero [mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = auxiliar;
                    tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()] = null;
                break;
                case "Peon":
                    auxiliar = new Peon();
                    auxiliar = tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
                    tablero [mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = auxiliar;
                    tablero [mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()] = null;
                break;
                default:
                    System.out.println("Ha habido un problema a la hora de identificar la clase de la Pieza");
                break;
            }
        
        }
       
        
}
