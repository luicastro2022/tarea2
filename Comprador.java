class Comprador{
    private String sonidob;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp) {
        vuelto = 0;

        Bebida b = exp.comprarBebida(m, cualProducto);
        if (b != null) {
            sonidob = b.beber();
        }


        Moneda v = exp.getVuelto();
        while (v != null) {
            vuelto = v.getValor() + vuelto;
            v = exp.getVuelto();
        }

    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        return sonidob;
    }
}