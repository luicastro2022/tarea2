abstract class Bebida extends Producto{

    /**
     *
     * @param serie numero arbitrario para identificar cada producto
     */
    public Bebida(int serie){
        super(serie);
    }

    /**
     *
     * @return 
     */
    public abstract String beber();
}