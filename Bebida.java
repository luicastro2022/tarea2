abstract class Bebida extends Producto{
    public Bebida(int serie){
        super(serie);
    }


    public abstract String beber();
    public abstract int getprecio();

}