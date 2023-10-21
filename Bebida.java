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
     * @return metodo para recuperar un dato private en este caso el string del nombre del producto
     */
    public abstract String beber();
}