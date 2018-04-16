/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dominio.Rectangulo6;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo6 rec1 = new Rectangulo6(1,1,2,3);
        Rectangulo6 rec2 = new Rectangulo6(2,1,4,5);
        Rectangulo6 rec3 = new Rectangulo6(1,3,3,4);
        Rectangulo6 rec4 = new Rectangulo6(2,1,2,5);
        Rectangulo6 rec5 = new Rectangulo6(1,3,6,3);
        
        ArrayList<Rectangulo6> rectangulos = new ArrayList();
        
        rectangulos.add(rec1);
        rectangulos.add(rec2);
        rectangulos.add(rec3);
        rectangulos.add(rec4);
        rectangulos.add(rec5);
        
        
        for (Rectangulo6 r : rectangulos) {
          System.out.println("***************************************");
          System.out.println("Rectangulo en la posicion: "+rectangulos.indexOf(r));
          System.out.println("Las coordenadas del punto son: "+r.getX()+","+r.getY()); 
          System.out.println("La base del rectangulo es: "+r.getBase());
          System.out.println("La altura del rectangulo es: "+r.getAltura());
          System.out.println("El perimetro del rectangulo es: "+r.getPerimetro());
          System.out.println("El area del rectangulo es: "+r.getArea());  
        }
       System.out.println("***************************************");    
        
        System.out.println("Ingresar un numero entre 0 y "+(rectangulos.size()-1));
        int indice = sc.nextInt();
        rectangulos.remove(indice);
        
        
        for (Rectangulo6 r : rectangulos) {
          System.out.println("***************************************");
          System.out.println("Rectangulo en la posicion: "+rectangulos.indexOf(r));
          System.out.println("Las coordenadas del punto son: "+r.getX()+","+r.getY()); 
          System.out.println("La base del rectangulo es: "+r.getBase());
          System.out.println("La altura del rectangulo es: "+r.getAltura());
          System.out.println("El perimetro del rectangulo es: "+r.getPerimetro());
          System.out.println("El area del rectangulo es: "+r.getArea());  
        }
        System.out.println("***************************************");    
       
    
            
        
        
    }
}
