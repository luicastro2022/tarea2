/** Bebida marca Sprite*/
class Sprite extends Bebida{
    /**
     * constructor de Sprite con un numero de serie para identificarlo
     * @param numSerie
     */
    public Sprite(int numSerie){
        super(numSerie);
    }
    /** getter para obtener el precio de Sprite*/
    public int getprecio(){return Precios.PrecioSprite.getPrecio();}
    /** "sonido" que se hace al beber una sprite*/
    public String beber(){
        return "sprite";
    }
}