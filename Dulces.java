abstract class Dulce extends Producto{
    /**
     *
     * @param serie numero de serie identificador de un dulce
     */
    public Dulce(int serie){
        super(serie);
    }

    /**
     *
     * @return devuelve el string identificador del dulce en cuestion
     */
    public abstract String comer();
    public abstract int getprecio();
}
