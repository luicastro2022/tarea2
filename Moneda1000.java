/**Moneda con valor de 1000*/
class Moneda1000 extends Moneda{
    /**Constructor por defecto de Moneda1000*/
    public Moneda1000(){
        super();
    }
    /**getter para obtener el valor de Moneda1000*/
    public int getValor(){
        return 1000;
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