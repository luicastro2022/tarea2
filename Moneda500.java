/**Monedas con un valor de 500*/
class Moneda500 extends Moneda{
    /**Constructor por defecto de Moneda500*/
    public Moneda500(){
        super();
    }
    /** getter para obtener el valor de Moneda500*/
    public int getValor(){
        return 500;
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
