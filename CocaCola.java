class CocaCola extends Bebida{
    private Precios precio;
    public CocaCola(int numSerie){
        super(numSerie);
        precio=Precios.PrecioCoca;
    }

    public String beber(){
        return "cocacola";
    }
}