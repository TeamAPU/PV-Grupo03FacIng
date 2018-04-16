
package aplicacion.test;

import aplicacion.dominio.Libro;
import aplicacion.util.ListLibro;
import java.util.Scanner;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto8 {
    public static void main(String[] args) {
        boolean r=true;
        String aux;
        char res;
        double precio;
        Scanner sc = new Scanner(System.in);
        
        
        
        ListLibro ls = new ListLibro();
        
        while (r){
            System.out.println("Registrar libro? s/n");
            res=sc.nextLine().charAt(0);
            
            if (res!='s'){
                r=false;
            }else{
                Libro l1 = new Libro();
                System.out.println("Ingresar el ISBN: ");
                aux=sc.nextLine();
                l1.setISBN(aux);
                System.out.println("Ingresar el Autor: ");
                aux=sc.nextLine();
                l1.setAutor(aux);
                System.out.println("Ingresar titulo: ");
                aux=sc.nextLine();
                l1.setTitulo(aux);
                System.out.println("Ingresar Precio: ");
                precio=sc.nextDouble();
                l1.setPrecio(precio);
                ls.agregar(l1);
                ls.mostrarLibros();
                
                
            }
            System.out.println("");
            sc.nextLine();
            
            
        }
        
                
        
    }
    
}
