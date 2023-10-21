/**Monedas con valor de 1500*/
class Moneda1500 extends Moneda{
    /**Constructor por defecto de Moneda1500*/
    public Moneda1500(){
        super();
    }
    /**getter para obtener el valor de las Moneda1500*/
    public int getValor(){return 1500;}
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
