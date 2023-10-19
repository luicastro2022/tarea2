public class Fanta extends Bebida{
    public Fanta(int serie){
        super(serie);
    }
    public int getprecio(){return Precios.PrecioFanta.getPrecio();}
    public String beber() {
        return "Fanta";
    }
}
