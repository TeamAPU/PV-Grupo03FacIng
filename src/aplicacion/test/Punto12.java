
package aplicacion.test;

import aplicacion.dominio.Categoria;
import aplicacion.dominio.Libro;
import aplicacion.util.Busqueda;
import aplicacion.util.CategoriaList;
import java.util.Scanner;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        CategoriaList lista = new CategoriaList();
        
        Categoria cat = new Categoria("Comedia");
        lista.agregar(cat);
        Categoria cat1 = new Categoria("Ciencia Ficcion");
        lista.agregar(cat1);
        Categoria cat2 = new Categoria("Oriental");
        lista.agregar(cat2);
        lista.mostrarCategoria();
        
        
        Libro l1 = new Libro("978-987-617-252-3","El libro de los cinco anillos","Musashi, Miyamoto", 500.0, lista.getCategorias(2));
        
        Libro l2 = new Libro("978-987-718-491-4","El arte de la guerra","Tzu, Sun", 250.0, lista.getCategorias(2));
        Libro l3 = new Libro("978-987-725-156-2","Danza de dragones, canción de hielo y fuego V","Martin, George R. R.3", 600.0, lista.getCategorias(0));
        Libro l4 = new Libro("978-950-547-063-1","Minotauro","Tolkien, John Ronald Reuen", 250.2, lista.getCategorias(1));
        
        //ListLibro libros = new ListLibro();
        
        
        
        
        System.out.println("Ingresar Categoria para buscar: ");
       // String aux=sc.nextLine();
        Busqueda librosBusqueda = new Busqueda();
        librosBusqueda.agregar(l1);
        librosBusqueda.agregar(l2);
        librosBusqueda.agregar(l3);
        librosBusqueda.agregar(l4);
        librosBusqueda.mostrarlibrosC();
        System.out.println("Ingrese un titulo para buscar: ");
        String buscar= sc.nextLine();
        
        librosBusqueda.mostrarEncontrado(librosBusqueda.buscar(buscar));
        
        
        
        
        
        
    }
}
