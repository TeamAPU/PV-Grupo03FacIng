
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
    
    /**
     * muestra la lista de libros
     */
    public void mostrarlibros(){
        
        for (Libro l : libros) {
            l.mostrarDatos();
        }
    }
    /**
     * busqueda por titulo
     * @param buscar
     * @return 
     */
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
    /*
    muestra libro encontrado
    */
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
