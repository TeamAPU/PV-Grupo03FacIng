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
public class Circulo {
    public double radio;
    public double superficie;
    public String color;

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie() {
        this.superficie = Math.PI*Math.sqrt(radio);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
        setSuperficie();
    }
    
    
    
    
    
}
