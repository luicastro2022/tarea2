/**
 * Un dulce llamado super8
 */
public class Super8 extends Dulce{
    /**
     * Constructor de super8
     * @param serie numero para identificarlo
     */
    public Super8(int serie){
        super(serie);
    }

    /** "sonido" que se hace al comer un super 8*/
    public String comer() {
        return "super8";
    }
    /** getter para obtener el precio de super8*/
    public int getprecio(){return Precios.PrecioSuper8.getPrecio();}
}
