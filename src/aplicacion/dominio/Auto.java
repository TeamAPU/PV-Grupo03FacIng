
package aplicacion.dominio;

/**
 *
 * @author Ma Ry Youkai
 */
public class Auto {
     private String patente;
     private String marca;
     private String modelo;
     private String color;
     private String tipoCombustible;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
/**
 * constructor
 * @param patente
 * @param marca
 * @param modelo
 * @param color
 * @param tipoCombustible 
 */
    public Auto(String patente, String marca, String modelo, String color, String tipoCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
    }
     /**
      * Muestra los datos del automovil
      */
      public void mostrarDatos(){
           System.out.println("**********************************");
            System.out.println("Patente: "+ getPatente());
            System.out.println("Marca: "+ getMarca());
            System.out.println("Modelo: "+ getModelo());
            System.out.println("Color: "+ getColor());
            System.out.println("Combustible: "+ getTipoCombustible());
          
      }
    
}
