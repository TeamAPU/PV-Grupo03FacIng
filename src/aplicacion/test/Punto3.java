
package aplicacion.test;

import aplicacion.dominio.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto3 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un lado del triangulo:");
        int lado= sc.nextInt();
        triangulo.setLado1(lado);
        
        System.out.println("Ingrese un lado del triangulo:");
        lado= sc.nextInt();
        triangulo.setLado2(lado);
        
        System.out.println("Ingrese un lado del triangulo:");
        lado= sc.nextInt();
        triangulo.setLado3(lado);
        
        if (triangulo.esTriangulo()){
            System.out.println("El perimetro es: "+ triangulo.perimetro());
        }else{
            System.out.println("No se ha formado la figura");
        }
        
        
       sc.close();
        
        
    }
}
