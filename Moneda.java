/**Clase para crear cada tipo de moneda y puede compararlas*/
abstract class Moneda implements Comparable<Moneda>{
    /** constructor por defecto de moneda*/
    public Moneda(){}
    /**getter para obtener el valor de cada moneda*/
    public abstract int getValor();

}