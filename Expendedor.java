class Expendedor{
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

    public Expendedor(int numProductos){
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        snicker = new Deposito();
        super8 = new Deposito();
        monVu = new Deposito();
        fanta=new Deposito();

        for(int i=0; i<numProductos; i++){
            CocaCola c = new CocaCola(100+i);
            Sprite s = new Sprite(200+i);
            Fanta f = new Fanta(300+i);

            Snicker sn=new Snicker(400+i);
            Super8 s8=new Super8(500+i);

            coca.addBebida(c);
            sprite.addBebida(s);
            fanta.addBebida(f);

            snicker.addDulce(sn);
            super8.addDulce(s8);
        }
    }

    public Bebida comprarBebida(Moneda m, int n){
        //si la moneda no es null guardar en x su valor
        int x = 0;
        if(m != null) {x = m.getValor();}

        int index[];
        index=new int[4];

        try{
            int a=index[n];
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Seleccion no valida");
        }

        if(n==COCA  && m!=null && x>=Precios.PrecioCoca.getPrecio()){
            Bebida c = coca.getBebida();
            if(c != null){
                int m50=(x-Precios.PrecioCoca.getPrecio())/50;
                x=x-50*m50;
                int m100=(x-Precios.PrecioCoca.getPrecio())/100;
                x=x-100*m100;
                int m500=(x-Precios.PrecioCoca.getPrecio())/500;
                x=x-500*m500;
                int m1000=(x-Precios.PrecioCoca.getPrecio())/1000;
                x=x-1000*m1000;
                int m1500=(x-Precios.PrecioCoca.getPrecio())/1500;
                x=x-1500*m1500;

                for(int i=0;i<m50;i++){monVu.addMoneda(new Moneda50());}
                for(int i=0;i<m100;i++){monVu.addMoneda(new Moneda100());}
                for(int i=0;i<m500;i++){monVu.addMoneda(new Moneda500());}
                for(int i=0;i<m1000;i++){monVu.addMoneda(new Moneda1000());}
                for(int i=0;i<m1500;i++){monVu.addMoneda(new Moneda1500());}

                return c;
            }

            else{
                monVu.addMoneda(m);
            }
        }

        else if(n==SPRITE && m != null && x>= Precios.PrecioSprite.getPrecio()) {
            Bebida s = sprite.getBebida();
            if(s != null){
                for(int i = 0; i<(x - Precios.PrecioSprite.getPrecio())/100; i++){
                    Moneda m100 = new Moneda100();
                    monVu.addMoneda(m100);
                }
                return s;
            }
            else{
                monVu.addMoneda(m);
            }
        }
        else if(n != COCA && n != SPRITE && m != null){
            monVu.addMoneda(m);
        }
        return null;
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}
