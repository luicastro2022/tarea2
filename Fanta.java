/**Bebida de marca Fanta*/
public class Fanta extends Bebida{
    /**
     * Constructor de Fanta con el numero serie que lo identifica
     * @param serie
     */
    public Fanta(int serie){
        super(serie);
    }
    /**getter para obtener el precio de fanta*/
    public int getprecio(){return Precios.PrecioFanta.getPrecio();}
    /**"sonido" que se hace al beber una fanta*/
    public String beber() {
        return "Fanta";
    }
}
