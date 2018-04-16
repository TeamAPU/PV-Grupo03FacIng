
package aplicacion.util;

import aplicacion.dominio.Libro;
import java.util.ArrayList;

/**
 *
 * @author Ma Ry Youkai
 */
public class ListLibro {
    
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
    public void mostrarLibros(){
        
        for (Libro l : libros) {
            l.mostrarDatos();
        }
    }
    
    public int buscar(String buscar){
         int indice=0, encontrado=-1;
        
       
         for (Libro l : libros) {
             System.out.println(l.getTitulo());
            if (buscar.equals(l.getTitulo())){
                encontrado=indice;
            }else{
                indice++;
                
            }
        }
    return encontrado;
    }
}
