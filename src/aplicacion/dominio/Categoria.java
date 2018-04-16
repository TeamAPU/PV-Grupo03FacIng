
package aplicacion.dominio;



/**
 *
 * @author Ma Ry Youkai
 */
public class Categoria {
    
    private String categoria;
    
    
    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void mostrarCategorias(){
        System.out.println("Categoria: "+categoria);
    }

    public Categoria(String categoria) {
        this.categoria = categoria;
    }
   
    
    
}
