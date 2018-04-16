
package aplicacion.test;

import aplicacion.dominio.Auto;
import java.util.Scanner;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca,modelo,color,tipoCombustible;
        boolean band=false;
        Auto arreglo[] = new Auto [5];
        
        Auto auto1 = new Auto("AB012AA","Fiat","Strada","rojo","diesel");
        Auto auto2 = new Auto("AB012AB","Ford","Ranger","azul","diesel");
        Auto auto3 = new Auto("AB012AC","Renault","Renault12","rojo","diesel");
        Auto auto4 = new Auto("AB012AD","Chevrolet","Corsa","negro","diesel");
        Auto auto5 = new Auto("AB012AE","Fiat","Strada","rojo","diesel");
        
        arreglo[0] = auto1;
        arreglo[1] = auto2;
        arreglo[2] = auto3;
        arreglo[3] = auto4;
        arreglo[4] = auto5;
         for (Auto a: arreglo) {
             a.mostrarDatos();
        }
         System.out.println("**********************************");
        System.out.println("Ingrese una patente para modificar: ");
        String pat = sc.nextLine();
        
        for (Auto a : arreglo) {
            if (pat.equals(a.getPatente())){
                System.out.println("Ingrese una marca para modificar: ");
                marca = sc.nextLine();
                a.setMarca(marca);
                System.out.println("Ingrese un modelo para modificar: ");
                modelo = sc.nextLine();
                a.setModelo(modelo);
                System.out.println("Ingrese una color para modificar: ");
                color = sc.nextLine();
                a.setColor(color);
                System.out.println("Ingrese un tipo de combustible para modificar: ");
                tipoCombustible = sc.nextLine();
                a.setTipoCombustible(tipoCombustible);
                System.out.println("Auto Modificado");
                band=true;
                
            }
                            
        }
        if (!band){
            System.out.println("Patente no encontrada ");
        }else{
             for (Auto a: arreglo) {
            a.mostrarDatos();
        }
         System.out.println("**********************************");
        }
        

       
    }
}
