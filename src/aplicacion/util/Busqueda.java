/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.util;

import aplicacion.dominio.Libro;
import aplicacion.util.ListLibro;
import java.util.ArrayList;

/**
 *
 * @author Ma Ry Youkai
 */
public class Busqueda {
    
    ArrayList<Libro> libros = new ArrayList();

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void agregar(Libro libro){
        this.libros.add(libro);
        
    }
    public void mostrarlibros(){
        
        for (int i=0; i<libros.size();i++) {
            libros.get(i).mostrarDatos();
        }
    }
    
     public void mostrarlibrosC(){
        
        for (int i=0; i<libros.size();i++) {
            libros.get(i).mostrarDatosC();
        }
    }
    
    public int buscar(String buscar){
         int indice=0, encontrado=-1;
        
       
         for (Libro l : libros) {
             
            if (buscar.equals(l.getTitulo())){
                encontrado=indice;
            }else{
                indice++;
                
            }
        }
         
        return encontrado;
        
    }
    
    public void mostrarEncontrado(int indice){
        if(indice==-1){
            System.out.println("Libro no encontrado"); 
        }else{
        System.out.println("ISBN: "+libros.get(indice).getISBN());
        System.out.println("Titulo: "+libros.get(indice).getTitulo());
        System.out.println("Autor: "+libros.get(indice).getAutor());
        System.out.println("Precio: "+libros.get(indice).getPrecio());
        }
        
        
    }
    
    
}
