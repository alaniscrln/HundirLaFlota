/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HundirLaFlota;

/**
 *
 * @author Amanda
 */
public class Casilla {

    int x;
    int y;
    Barco barco;
    boolean fueBombardeada;

    /**
     * Constructor para crear casilla sin barco, sólo agua.
     * @param x
     * @param y 
     */
    public Casilla(int x, int y) {

        this.x = x;
        this.y = y;
        this.fueBombardeada = false;
        
    }
    
    /**
     * Constructor para crear casilla ocupada por barco.
     * @param x
     * @param y
     * @param barco 
     */
    public Casilla(int x, int y, Barco barco){
        
        this.x = x;
        this.y = y;
        this.fueBombardeada = false;
        this.barco = barco;
    }
    
    public boolean obtenerFueBombardeada(){
        
        return this.fueBombardeada;
    }
    
    public boolean contieneBarco(){
        
        if (this.barco != null){
            return true;
        }else{
            return false;
        }
    }
    
    public void recibirBombardeo() throws Exception{
        
        if (obtenerFueBombardeada()){
            throw new Exception ("Ya fue bombardeada");
        }
        
        this.fueBombardeada = true;
        
        if (contieneBarco()){
            
            this.barco.recibirImpacto();
        }
    }
    
    private boolean posicion(int pos){      // antes de llamar al metodo controlar q solo recibe un '1' o un '0'
        if (pos == 1) {
            return true;    // vertical hacia abajo
        }else{
            return false;   // horizontal hacia derecha
        }
    }
}
