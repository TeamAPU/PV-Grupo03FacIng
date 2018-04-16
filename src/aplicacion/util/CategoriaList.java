
package aplicacion.util;

import aplicacion.dominio.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Ma Ry Youkai
 */
public class CategoriaList {
   ArrayList<Categoria> categorias = new ArrayList();

    public String getCategorias(int indice) {
        
        String cad;
        
        cad=categorias.get(indice).getCategoria();
        
        return cad;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
   
   public void agregar(Categoria categoria){
        this.categorias.add(categoria);
    }
    
   
   public void mostrarCategoria(){
        
        for (Categoria c : categorias) {
            c.mostrarCategorias();
        }
    }
}
