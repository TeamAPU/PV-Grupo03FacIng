/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dominio.Punto;
import aplicacion.dominio.Rectangulo;
import java.util.Scanner;


/**
 *
 * @author David
 */
public class Punto02 {

    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Punto unpunto = new Punto(0, 0);
        Rectangulo unlado = new Rectangulo(0,0);
        
        //Ingresa un punto usando la clase Punto
        System.out.println("Ingrese el punto X: ");
        unpunto.setX(scanner.nextInt());
        System.out.println("Ingrese el punto Y: ");
        unpunto.setY(scanner.nextInt());
        
        //Ingresa la base y altura usando la clase Rectangulo
        System.out.println("Ingrese la base: ");
        unlado.setBase(scanner.nextDouble());//cambia la base
        System.out.println("Ingrese la altura: ");
        unlado.setAltura(scanner.nextDouble());//cambia la altura
        
        //Muestra resultados en pantalla
        System.out.println("La superficie es: " + unlado.superficieRectangulo());
        System.out.println("El perimetro es: " + unlado.perimetroRectangulo());
        unlado.posicionPuntos(unpunto.getX(),unpunto.getY());
    }
    
}
