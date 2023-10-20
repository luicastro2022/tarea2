public class Snicker extends Dulce{
    public Snicker(int serie){
        super(serie);
    }
    public String comer() {
        return "snicker";
    }
    public int getprecio(){return Precios.PrecioSnicker.getPrecio();}
}
