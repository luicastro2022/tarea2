/** Clase para identificar todos los productos disponibles*/
public class Producto {
    /** valor que identifica cada producto creado*/
    private int serie;
    /** constructor de producto que recibe el numero de serie de un producto*/
    public Producto(int numserie){
        serie=numserie;
    }
    /** getter para obtener el num de serie de un producto*/
    public int getSerie() {
        return serie;
    }
}