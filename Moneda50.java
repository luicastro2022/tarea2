class Moneda50 extends Moneda{
    public Moneda50(){
        super();
    }
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