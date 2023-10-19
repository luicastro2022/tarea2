class Sprite extends Bebida{
    public Sprite(int numSerie){
        super(numSerie);
    }

    public int getprecio(){return Precios.PrecioSprite.getPrecio();}
    public String beber(){
        return "sprite";
    }
}