public class Snicker extends Dulces{
    public Snicker(int serie){
        super(serie);
    }
    public String comer() {
        return "doblon";
    }
    public int getprecio(){return Precios.PrecioSnicker.getPrecio();}
}
