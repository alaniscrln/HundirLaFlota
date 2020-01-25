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
    private String nombre;
    
    //--------------------------------------------------------------------------------------
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
        
    //--------------------------------------------------------------------------------------
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //--------------------------------------------------------------------------------------
    
    public void jugarRonda(Tablero t1){
        
    }
    
    public boolean colocarBarco(){
        boolean colocado = false;
        //....
        
        
        
        
        return colocado;
    }
    
    public void bombardear(Casilla pos, Tablero tablero){
        
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
