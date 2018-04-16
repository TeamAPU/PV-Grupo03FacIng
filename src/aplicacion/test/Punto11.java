/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dominio.Zapatilla;
import aplicacion.util.ListZapatilla;
import java.util.Scanner;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean r=true;
        String aux;
        char res,aux1;
        
        ListZapatilla lista = new ListZapatilla();
        
        while (r){
            System.out.println("Registrar zapatilla? s/n");
            res=sc.nextLine().charAt(0);
            
            if (res!='s'){
                r=false;
            }else{
                Zapatilla zapatilla = new Zapatilla();
                System.out.println("Ingrese una marca de zapatilla");
                aux=sc.nextLine();
                zapatilla.setMarca(aux);
                System.out.println("Es original? (s/n)");
                aux1=sc.nextLine().charAt(0);
                if (aux1=='s'){
                   zapatilla.setEsOriginal(true);
                }else{
                    zapatilla.setEsOriginal(false); 
                }
                
                lista.agregar(zapatilla);
                lista.mostrarZapatilla();
                
                
            }
         
            
            
        }
        
        
        sc.close();
    }
}
