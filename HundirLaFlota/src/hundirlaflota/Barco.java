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
public class Barco {
    
    int longitud;
    int vidas;
    
    public Barco(int longitud){
        
        this.longitud = longitud;
        this.vidas = longitud;
        
    }
    
    
    public boolean estaHundido(){
        
        if(this.vidas == 0){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean estaTocado(){
        
        if(this.vidas != this.longitud){
            return true;
        }else{
            return false;
        }
    }
    
    
    public void recibirImpacto(){
        
        this.vidas--;
    }
}
