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
public class Tablero {
    Casilla[][] c;
    int size;
    Barco[] barco = new Barco[6];
    
    
    //-----------------------------------------------------------------------------

    public Tablero(int n) {   
        this.c = new Casilla[n][n];     // redimensiono la matriz
        for (int i = 0; i < c.length; i++) {        //recorro la matriz
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = new Casilla(i, j);            // en la pos de esa matriz, creo un obj casilla    
            }
        }
        
        for (int i = 0, j = 3; i < barco.length; i = i+2, j--) {
            barco[i] = new Barco(j);
            barco[i+1] = new Barco(j);
            }
        
        this.size = n;
        
    }
    
    //-----------------------------------------------------------------------------
    
    
    
    
    public void mostrar(){
        System.out.println("  1 2 3 4");
        for (int i = 0; i < c.length; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j].getValue() + " ");
            }
            System.out.println("");
        }
    }   
}
