/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**package aplicacion.dominio;

/**
 *
 * @author Carolina
 */
/**public class ArrayNumeros {
    private int arregloNumeros[];
    
    public ArrayNumeros(){
        
    }

    public int[] getArregloNumeros() {
        return arregloNumeros;
    }

    public void setArregloNumeros(int[] arregloNumeros) {
        this.arregloNumeros = arregloNumeros;
    }
    
    public int obtenerMayor(){
         int mayor = arregloNumeros[0];
        for (int i = 1; i < arregloNumeros.length; i++) {
            if (mayor<arregloNumeros[i]) {
                mayor=arregloNumeros[i];
            }
        }
        return mayor;
        
        
    }
    
    
    public int obtenerMenor(){
         int menor = arregloNumeros[0];
        for (int i = 1; i < arregloNumeros.length; i++) {
            if (menor>arregloNumeros[i]) {
                menor=arregloNumeros[i];
            }
        }
        
        return menor;
    }
    
     public int obtenerPromedio(){
        int suma=0;
        for (int i = 0; i < arregloNumeros.length; i++) {
            suma = suma + arregloNumeros[i];
        }
        return suma/arregloNumeros.length;
    }
    
      public void mostrarElementosDelArreglo(){
        for(int i=0; i< arregloNumeros.length; i++){
            System.out.println("Valor del elemento: "+ arregloNumeros[i]);
        }
    }
    
}
