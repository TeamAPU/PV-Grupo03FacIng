/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

import java.text.DecimalFormat;

/**
 *
 * @author Ma Ry Youkai
 */
public class Producto {
    DecimalFormat df = new DecimalFormat("#.00");
    public String codigo;
    public String nombre;
    public double precioUnitario;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
   public void cuotas(int cuotas){
       double recargo=0, subTotal=0;
       double valorCuota= precioUnitario/cuotas;
       for (int i=1; i<=cuotas; i++){
           if (i==1){
               System.out.println("Valor de la cuota 1: "+df.format(valorCuota));
               recargo=0;
           }else{
             recargo= valorCuota*0.015;  
             System.out.println("Valor de la cuota "+i+": "+df.format(valorCuota+recargo));
             
             System.out.println("Recargo: 0"+df.format(recargo));
             valorCuota=valorCuota+recargo;
             
           }
           subTotal=valorCuota+subTotal;
       }
       System.out.println("Precio Total a pagar: "+df.format(subTotal)); 
   } 
}
