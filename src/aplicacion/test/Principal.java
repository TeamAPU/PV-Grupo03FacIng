/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dominio.Punto;

/**
 *
 * @author Carolina
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 2);
        Punto punto2 = new Punto(3, 4);
        System.out.println("La Distancia entre los puntos es: " +punto1.calcularDistanciaEntrePuntos(punto2));
        punto1.calcularDistanciaEntrePuntos(punto2);
    
        
        
    }
    
}
