/**Enumeracion que guarda todos los precios de los productos disponibles*/
public enum Precios{
    PrecioCoca(100),PrecioFanta(100),PrecioSprite(150),PrecioSnicker(450),PrecioSuper8(150);
    private final int precio;
    Precios(int precio){this.precio=precio;}
    /** getter para obtener el precio de un producto*/
    public int getPrecio(){return precio;}

}