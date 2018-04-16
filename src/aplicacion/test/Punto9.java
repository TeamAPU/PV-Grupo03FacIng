/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.util.Busqueda;
import aplicacion.dominio.Libro;
import aplicacion.util.ListLibro;
import java.util.Scanner;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro l1 = new Libro("978-987-617-252-3","El libro de los cinco anillos","Musashi, Miyamoto", 500.0);
        Libro l2 = new Libro("978-987-718-491-4","El arte de la guerra","Tzu, Sun", 250.0);
        Libro l3 = new Libro("978-987-725-156-2","Danza de dragones, canción de hielo y fuego V","Martin, George R. R.3", 600.0);
        Libro l4 = new Libro("978-950-547-063-1","Minotauro","Tolkien, John Ronald Reuen", 250.);
      
    
        Busqueda libros = new Busqueda();
        libros.agregar(l1);
        libros.agregar(l2);
        libros.agregar(l3);
        libros.agregar(l4);
       
        
        libros.mostrarlibros();
        
        System.out.println("Ingrese un titulo para buscar: ");
        String buscar= sc.nextLine();
        
        libros.mostrarEncontrado(libros.buscar(buscar));
    }
}
