class CocaCola extends Bebida{

    public CocaCola(int numSerie){
        super(numSerie);
    }
    public int getprecio() {return Precios.PrecioCoca.getPrecio();}

    public String beber(){
        return "cocacola";
    }
}