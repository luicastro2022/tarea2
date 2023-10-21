/**
 * Un expendedor que  ofrece los productos al cliente
 */
class Expendedor {
    /**
     * Valores para seleccionar los productos
     */
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA=3;
    public static final int SNICKER = 4;
    public static final int SUPER8 = 5;

    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito snicker;
    private Deposito super8;

    private Deposito monVu;

    /**
     * Constructor de expendedor
     * @param numProductos Es la cantidad de productos que se agregara a cada deposito
     */
    public Expendedor(int numProductos) {
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        snicker = new Deposito();
        super8 = new Deposito();
        monVu = new Deposito();
        fanta = new Deposito();

        for (int i = 0; i < numProductos; i++) {
            CocaCola c = new CocaCola(100 + i);
            Sprite s = new Sprite(200 + i);
            Fanta f = new Fanta(300 + i);
            Snicker sn = new Snicker(400 + i);
            Super8 s8 = new Super8(500 + i);

            fanta.addBebida(f);
            coca.addBebida(c);
            sprite.addBebida(s);
            snicker.addDulce(sn);
            super8.addDulce(s8);
        }
    }

    public Bebida comprarBebida(Moneda m, int n) throws Exception {
        //si la moneda no es null guardar en x su valor
        int x = 0;
        if (m != null) {
            x = m.getValor();
        }
        if(m==null){
            throw new PagoIncorrectoException("No usaste método de pago, intenta de nuevo");
        }
        if (n == COCA && m != null && x >= Precios.PrecioCoca.getPrecio()) {
            Bebida c = coca.getBebida();
            if (c != null) {
                int m50 = (x - Precios.PrecioCoca.getPrecio()) / 50;
                x = x - 50 * m50;
                int m100 = (x - Precios.PrecioCoca.getPrecio()) / 100;
                x = x - 100 * m100;
                int m500 = (x - Precios.PrecioCoca.getPrecio()) / 500;
                x = x - 500 * m500;
                int m1000 = (x - Precios.PrecioCoca.getPrecio()) / 1000;
                x = x - 1000 * m1000;
                int m1500 = (x - Precios.PrecioCoca.getPrecio()) / 1500;
                x = x - 1500 * m1500;

                for (int i = 0; i < m50; i++) {
                    monVu.addMoneda(new Moneda50());
                }
                for (int i = 0; i < m100; i++) {
                    monVu.addMoneda(new Moneda100());
                }
                for (int i = 0; i < m500; i++) {
                    monVu.addMoneda(new Moneda500());
                }
                for (int i = 0; i < m1000; i++) {
                    monVu.addMoneda(new Moneda1000());
                }
                for (int i = 0; i < m1500; i++) {
                    monVu.addMoneda(new Moneda1500());
                }

                return c;
            } else {
                monVu.addMoneda(m);
                throw new NoHayProductoException("No quedan mas unidades de este producto");
            }
        }
        else if (n == SPRITE && m != null && x >= Precios.PrecioSprite.getPrecio()) {
            Bebida s = sprite.getBebida();
            if (s != null) {
                int m50 = (x - Precios.PrecioSprite.getPrecio()) / 50;
                x = x - 50 * m50;
                int m100 = (x - Precios.PrecioSprite.getPrecio()) / 100;
                x = x - 100 * m100;
                int m500 = (x - Precios.PrecioSprite.getPrecio()) / 500;
                x = x - 500 * m500;
                int m1000 = (x - Precios.PrecioSprite.getPrecio()) / 1000;
                x = x - 1000 * m1000;
                int m1500 = (x - Precios.PrecioSprite.getPrecio()) / 1500;
                x = x - 1500 * m1500;

                for (int i = 0; i < m50; i++) {
                    monVu.addMoneda(new Moneda50());
                }
                for (int i = 0; i < m100; i++) {
                    monVu.addMoneda(new Moneda100());
                }
                for (int i = 0; i < m500; i++) {
                    monVu.addMoneda(new Moneda500());
                }
                for (int i = 0; i < m1000; i++) {
                    monVu.addMoneda(new Moneda1000());
                }
                for (int i = 0; i < m1500; i++) {
                    monVu.addMoneda(new Moneda1500());
                }

                return s;
            } else {
                monVu.addMoneda(m);
                throw new NoHayProductoException("No quedan mas unidades de este producto");
            }
        }
        else if (n == FANTA && m != null && x >= Precios.PrecioFanta.getPrecio()) {
            Bebida f = fanta.getBebida();
            if (f != null) {
                int m50 = (x - Precios.PrecioFanta.getPrecio()) / 50;
                x = x - 50 * m50;
                int m100 = (x - Precios.PrecioFanta.getPrecio()) / 100;
                x = x - 100 * m100;
                int m500 = (x - Precios.PrecioFanta.getPrecio()) / 500;
                x = x - 500 * m500;
                int m1000 = (x - Precios.PrecioFanta.getPrecio()) / 1000;
                x = x - 1000 * m1000;
                int m1500 = (x - Precios.PrecioFanta.getPrecio()) / 1500;
                x = x - 1500 * m1500;

                for (int i = 0; i < m50; i++) {monVu.addMoneda(new Moneda50());}
                for (int i = 0; i < m100; i++) {monVu.addMoneda(new Moneda100());}
                for (int i = 0; i < m500; i++) {monVu.addMoneda(new Moneda500());}
                for (int i = 0; i < m1000; i++) {monVu.addMoneda(new Moneda1000());}
                for (int i = 0; i < m1500; i++) {monVu.addMoneda(new Moneda1500());}
                return f;
            } else {
                monVu.addMoneda(m);
                throw new NoHayProductoException("No quedan más unidades de este producto");
            }

        }
        else {
            monVu.addMoneda(m);
            throw new PagoInsuficienteException("No hay saldo suficiente para comprar el producto");
        }
    }
    public Dulce comprarDulce(Moneda m, int n) throws Exception {
        //si la moneda no es null guardar en x su valor
        int x = 0;
        if (m != null) {
            x = m.getValor();
        }
        if(m==null){
            throw new PagoIncorrectoException("No usaste método de pago, intenta de nuevo");
        }
        if (n == SNICKER && m != null && x >= Precios.PrecioSnicker.getPrecio()) {
            Dulce sn = snicker.getDulce();
            if (sn != null) {
                int m50 = (x - Precios.PrecioSnicker.getPrecio()) / 50;
                x = x - 50 * m50;
                int m100 = (x - Precios.PrecioSnicker.getPrecio()) / 100;
                x = x - 100 * m100;
                int m500 = (x - Precios.PrecioSnicker.getPrecio()) / 500;
                x = x - 500 * m500;
                int m1000 = (x - Precios.PrecioSnicker.getPrecio()) / 1000;
                x = x - 1000 * m1000;
                int m1500 = (x - Precios.PrecioSnicker.getPrecio()) / 1500;
                x = x - 1500 * m1500;

                for (int i = 0; i < m50; i++) {monVu.addMoneda(new Moneda50());}
                for (int i = 0; i < m100; i++) {monVu.addMoneda(new Moneda100());}
                for (int i = 0; i < m500; i++) {monVu.addMoneda(new Moneda500());}
                for (int i = 0; i < m1000; i++) {monVu.addMoneda(new Moneda1000());}
                for (int i = 0; i < m1500; i++) {monVu.addMoneda(new Moneda1500());}

                return sn;
            }
            else{
                monVu.addMoneda(m);
                throw new NoHayProductoException("No quedan mas unidades de este producto");
            }
        }
        else if (n == SUPER8 && m != null && x >= Precios.PrecioSuper8.getPrecio()){
            Dulce s8=super8.getDulce();
            if (s8 != null) {
                int m50 = (x - Precios.PrecioSuper8.getPrecio()) / 50;
                x = x - 50 * m50;
                int m100 = (x - Precios.PrecioSuper8.getPrecio()) / 100;
                x = x - 100 * m100;
                int m500 = (x - Precios.PrecioSuper8.getPrecio()) / 500;
                x = x - 500 * m500;
                int m1000 = (x - Precios.PrecioSuper8.getPrecio()) / 1000;
                x = x - 1000 * m1000;
                int m1500 = (x - Precios.PrecioSuper8.getPrecio()) / 1500;
                x = x - 1500 * m1500;

                for (int i = 0; i < m50; i++) {monVu.addMoneda(new Moneda50());}
                for (int i = 0; i < m100; i++) {monVu.addMoneda(new Moneda100());}
                for (int i = 0; i < m500; i++) {monVu.addMoneda(new Moneda500());}
                for (int i = 0; i < m1000; i++) {monVu.addMoneda(new Moneda1000());}
                for (int i = 0; i < m1500; i++) {monVu.addMoneda(new Moneda1500());}

                return s8;
            }
            else{
                monVu.addMoneda(m);
                throw new NoHayProductoException("No quedan mas unidades de este producto");
            }
        }

        else{
            monVu.addMoneda(m);
            throw new PagoInsuficienteException("No hay saldo suficiente para comprar el producto");
        }
        return null;
    }


    public Moneda getVuelto () {
        return monVu.getMoneda();
    }
}