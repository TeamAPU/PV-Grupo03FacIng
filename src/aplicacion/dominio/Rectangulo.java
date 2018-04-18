/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

import aplicacion.util.ArregloDePuntos;

/**
 *
 * @author David
 */
public class Rectangulo {
    
    private double base;
    private double altura;
    private final Punto punto = new Punto();

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double superficieRectangulo(){
        
        return base*altura;

    }
    
    public double perimetroRectangulo(){
        
        return base * 2 + altura*2;
        
    } 

   
    public void posicionPuntos(int x,int y){
        Punto puntoUno = new Punto(x, (int) (y+altura));
        Punto puntoDos = new Punto((int)(x+base),(int)(y+altura));
        Punto puntoTres = new Punto((int) (x+base),y);
        
        ArregloDePuntos arregloDePuntos = new ArregloDePuntos();
        
        arregloDePuntos.getPuntosCuadrados()[0] = puntoUno;
        arregloDePuntos.getPuntosCuadrados()[1] = puntoDos;
        arregloDePuntos.getPuntosCuadrados()[2] = puntoTres;
        
        arregloDePuntos.mostrarArreglo();
    }
    public void unPuntoCuadrado(int x,int y){
        punto.setXY(x, y);
        
    }
    public void mostraPunto(){
        ArregloDePuntos arregloDePuntos = new ArregloDePuntos();
        arregloDePuntos.getPuntosCuadrados()[0] = punto;
        arregloDePuntos.mostrarUnArreglo();
    }
    
    
}
