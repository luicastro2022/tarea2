
class Moneda1500 extends Moneda{

    public Moneda1500(){
        super();
    }
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
