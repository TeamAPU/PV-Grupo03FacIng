
package aplicacion.test;

import aplicacion.dominio.Circulo;
import java.util.ArrayList;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto5 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3.5, "rojo");
        Circulo c2 = new Circulo(1.0, "verde");
        Circulo c3 = new Circulo(4.5, "azul");
        
        ArrayList<Circulo> circulos = new ArrayList();
        
        circulos.add(c1);
        circulos.add(c2);     
        circulos.add(c3);
        
        for (Circulo c : circulos) {
            System.out.println("El radio es: "+c.getRadio());
            System.out.println("La superficie es: "+c.getSuperficie());
            System.out.println("El color es: "+c.getColor());
        }
        
    }
}
