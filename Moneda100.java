/** Monedas con un valor de 100*/
class Moneda100 extends Moneda{
    /**Constructor por defecto de Moneda100*/
    public Moneda100(){
        super();
    }
    /** getter para obtener el valor de las Moneda100*/
    public int getValor(){
        return 100;
    }
    public int compareTo(Moneda o) {
        if (this.getValor() > o.getValor()) {
            return 1;
        } else if (this.getValor() < o.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
}