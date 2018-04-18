/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dominio.Rectangulo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo rec1 = new Rectangulo(1,2);
        Rectangulo rec2 = new Rectangulo(4,5);
        Rectangulo rec3 = new Rectangulo(3,4);
        Rectangulo rec4 = new Rectangulo(2,5);
        Rectangulo rec5 = new Rectangulo(6,3);
        rec1.unPuntoCuadrado(1, 2);
        rec2.unPuntoCuadrado(1, 3);
        rec3.unPuntoCuadrado(1, 4);
        rec4.unPuntoCuadrado(1, 5);
        rec5.unPuntoCuadrado(1, 6);
        ArrayList<Rectangulo> rectangulos = new ArrayList();
        
        rectangulos.add(rec1);
        rectangulos.add(rec2);
        rectangulos.add(rec3);
        rectangulos.add(rec4);
        rectangulos.add(rec5);
        
        
        for (Rectangulo r : rectangulos) {
          System.out.println("***************************************");
          System.out.println("Rectangulo en la posicion: "+rectangulos.indexOf(r));
          r.mostraPunto();
          System.out.println("La base del rectangulo es: "+r.getBase());
          System.out.println("La altura del rectangulo es: "+r.getAltura());
          System.out.println("El perimetro del rectangulo es: "+r.perimetroRectangulo());
          System.out.println("El area del rectangulo es: "+r.superficieRectangulo());  
        }
       System.out.println("***************************************");    
        
        System.out.println("Ingresar un numero entre 0 y "+(rectangulos.size()-1));
        int indice = sc.nextInt();
        rectangulos.remove(indice);
        
        
        for (Rectangulo r : rectangulos) {
          System.out.println("***************************************");
          System.out.println("Rectangulo en la posicion: "+rectangulos.indexOf(r));
          System.out.println("Las coordenadas del punto son: " );
          r.mostraPunto();
          System.out.println("La base del rectangulo es: "+r.getBase());
          System.out.println("La altura del rectangulo es: "+r.getAltura());
          System.out.println("El perimetro del rectangulo es: "+r.perimetroRectangulo());
          System.out.println("El area del rectangulo es: "+r.superficieRectangulo());  
        }
        System.out.println("***************************************");    
       
    
            
        
        
    }
}
