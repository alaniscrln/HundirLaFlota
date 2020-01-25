/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirlaflota;

/**
 *
 * @author Amanda
 */
public class Casilla {
    private int x;
    private int y;
    private Barco barco;            //no entiendo para q (duda de alanis)
    private boolean fueBombardeada;
    private String value;

    //-----------------------------------------------------------------------------

    public Casilla(){}
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
    
    //-----------------------------------------------------------------------------
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public boolean isFueBombardeada() {
        return fueBombardeada;
    }

    public void setFueBombardeada(boolean fueBombardeada) {
        this.fueBombardeada = fueBombardeada;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    //-----------------------------------------------------------------------------
   
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

   
}
