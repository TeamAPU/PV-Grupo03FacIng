
package aplicacion.dominio;

/**
 *
 * @author Ma Ry Youkai
 */
public class Rectangulo6 {
    
    private int x;
    private int y;
    private int base;
    private int altura;
    private int perimetro;
    private int area;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    private void setPerimetro() {
        this.perimetro = (base+altura)*2;
    }

    private void setArea() {
        this.area = base*altura;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public int getArea() {
        return area;
    }

    public Rectangulo6(int x, int y, int base, int altura) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.altura = altura;
        setPerimetro();
        setArea();
    }
    
    
    
    
    
    
    
    
}
