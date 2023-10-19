class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp){
        vuelto = 0;
        Bebida b = exp.comprarBebida(m, cualProducto);
        if(b != null){
            sonido = b.beber();
        }
        Moneda v = exp.getVuelto();
        while(v != null){
            vuelto = v.getValor() + vuelto;
            v = exp.getVuelto();
        }

    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }
}