/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

/**
 *
 * @author Ma Ry Youkai
 */
public class Zapatilla {
    private String marca;
    private boolean esOriginal;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsOriginal() {
        return esOriginal;
    }

    public void setEsOriginal(boolean esOriginal) {
        this.esOriginal = esOriginal;
    }
    
    
    public void  mostrarDatos(){
        String original;
        if (esOriginal==true){
            original= "es Original";
        }else{
            original="es Copia";
        }
        System.out.println("Marca: "+getMarca()+ " condicion: "+original);
    }
    
}
