/** Dulce marca Snicker*/
public class Snicker extends Dulce{
    /** constructor de Snicker con un numero de serie para identificarlo*/
    public Snicker(int serie){
        super(serie);
    }
    /** "sonido" o frase que se obtiene al comer un snicker*/
    public String comer() {
        return "snicker";
    }
    /** getter para obtener el precio de un snicker*/
    public int getprecio(){return Precios.PrecioSnicker.getPrecio();}
}
