/**Monedas con un valor de 50*/
class Moneda50 extends Moneda{
    /**Constructor por defecto de Moneda50*/
    public Moneda50(){
        super();
    }
    /**Getter para obtener el valor de Moneda50*/
    public int getValor(){
        return 50;
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