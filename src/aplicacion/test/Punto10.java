/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dominio.Producto;
import java.util.Scanner;

/**
 *
 * @author Ma Ry Youkai
 */
public class Punto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Producto producto = new Producto();
        System.out.println("Ingrese el codigo del producto");
        String prod = sc.nextLine();
        producto.setCodigo(prod);
        System.out.println("Ingrese el nombre del producto");
        prod = sc.nextLine();
        producto.setNombre(prod);
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
        producto.setPrecioUnitario(precio);
        System.out.println("Ingrese Cantidad de cuotas");
        int cuotas = sc.nextInt();
        
        if (cuotas==1){
        System.out.println("EL total a pagar es: "+producto.getPrecioUnitario());
         }else{
            producto.cuotas(cuotas);
            }
        
        
        
        
    }
}
