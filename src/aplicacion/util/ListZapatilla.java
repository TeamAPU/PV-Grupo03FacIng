/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.util;


import aplicacion.dominio.Zapatilla;
import java.util.ArrayList;

/**
 *
 * @author Ma Ry Youkai
 */
public class ListZapatilla {
    
    ArrayList<Zapatilla> zapatillas = new ArrayList();

    public ArrayList<Zapatilla> getZapatillas() {
        return zapatillas;
    }

    public void setZapatillas(ArrayList<Zapatilla> zapatillas) {
        this.zapatillas = zapatillas;
    }
    
    public void agregar(Zapatilla zapatilla){
        this.zapatillas.add(zapatilla);
    }
    
     public void mostrarZapatilla(){
        
        for (Zapatilla z : zapatillas) {
            z.mostrarDatos();
        }
    }
}
