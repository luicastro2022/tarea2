public class Super8 extends Dulce{
    public Super8(int serie){
        super(serie);
    }
    public String comer() {
        return "super8";
    }
    public int getprecio(){return Precios.PrecioSuper8.getPrecio();}
}
