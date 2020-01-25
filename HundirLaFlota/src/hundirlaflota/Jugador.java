/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirlaflota;

/**
 *
 * @author Alanis
 */
public class Jugador {
    private char nombre;
    private Tablero tablero;
    
    //--------------------------------------------------------------------------------------
    
    public Jugador(char nombre) {
        this.nombre = nombre;
    }
        
    //--------------------------------------------------------------------------------------
        
    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }
    
    //--------------------------------------------------------------------------------------
    
    public void jugarRonda(Tablero t1){
        
        System.out.println("");
        bombardear(, t1);
    }
    
    public boolean colocarBarco(Jugador j, Barco barco, int cabezaX, int cabezaY, boolean direccion){
        boolean colocado = false;
        //....
        // comprobar q en las casillas estan disponibles. 7
        // instanciar casillas nuevas, guardando el barco (new casilla( i, j , barco ))
        
        
        
        
        return colocado;
    }
    
    public void bombardear(int x, int y, Tablero tablero){
       Casilla a = tablero.c[x][y].;
    }
    
    public void bombardearAutomatico(Tablero tablero){
        
    }
//    alanis.jugarRonda(t1);
//    tablero{
//        jugador1
//        jugador2
//    }
    
        /*
    Jugador    //alanis
    String nombre;    //letra para identificar sus barcos
JugarRonda(Tablero)
crearbarcos();    // no estoy segura
(guardar los barcos en una lista, cuando esta esté vacía (head == null), significa q he perdido)(tambn se puede hacer con un array)

    
    */




}
