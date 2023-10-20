public enum Precios{
    PrecioCoca(100),PrecioFanta(100),PrecioSprite(150),PrecioSnicker(450),PrecioSuper8(150);
    private final int precio;
    Precios(int precio){this.precio=precio;}
    public int getPrecio(){return precio;}

}