
package aplicacion.dominio;

/**
 *
 * @author Ma Ry Youkai
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private double precio;
    private String categoria;
    public String getISBN() {
        return ISBN;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarDatos(){
        System.out.println("ISBN: "+getISBN()+" -Autor : "+getAutor()+" -Titulo: "+getTitulo()+" -Precio: "+getPrecio());
        
    }

    public void mostrarDatosC(){
        System.out.println("ISBN: "+getISBN()+" -Autor : "+getAutor()+" -Titulo: "+getTitulo()+" -Precio: "+getPrecio()+ " Categoria:"+getCategoria());
        
    }
    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, double precio, String categoria) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
    }

    
    public Libro(String ISBN, String titulo, String autor, double precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
}
