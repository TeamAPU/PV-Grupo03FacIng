
package aplicacion.util;
import aplicacion.dominio.Punto;
/**
 *
 * @author David
 */
public class ArregloDePuntos {
    private Punto[] puntosCuadrados;

    public ArregloDePuntos() {
        
        puntosCuadrados = new Punto[3];
    }

    public ArregloDePuntos(Punto[] puntosCuadrados) {
        this.puntosCuadrados = puntosCuadrados;
    }

    public Punto[] getPuntosCuadrados() {
        return puntosCuadrados;
    }

    public void setPuntosCuadrados(Punto[] puntosCuadrados) {
        this.puntosCuadrados = puntosCuadrados;
    }
public void mostrarArreglo(){
        for(int i=0;i < puntosCuadrados.length;i++){
            if(puntosCuadrados[i] != null){
               
                Punto c = puntosCuadrados[i];
                System.out.println("Puntos: "+c.getX()+","+c.getY());
            }else{
                System.out.println("No existe"+i);
            }    
            
        }
    }
    
}
