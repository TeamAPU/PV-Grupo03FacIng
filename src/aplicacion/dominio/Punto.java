/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

/**
 *
 * @author Carolina
 */
public class Punto {
    
    private int x; //declaramos los puntos como variable 
    private int y;

    public Punto(){
        
    }
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    

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
    
    
    public double calcularDistanciaEntrePuntos(Punto otroPunto){
        return Math.sqrt(Math.pow(otroPunto.getX()-x, 2)+ Math.pow(otroPunto.getY()-y, 2));//calculo de la distancia entre dos puntos
        
    }
    
    
    
}
