public class Fanta extends Bebida{
    private Precios precio;
    public Fanta(int serie){
        super(serie);
        precio=Precios.PrecioFanta;
    }

    public int getPrecio() {
        return precio.getPrecio();
    }

    public String beber() {
        return "Fanta";
    }
}
