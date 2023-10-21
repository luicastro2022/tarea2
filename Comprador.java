

class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws Exception {
        vuelto = 0;

        if(cualProducto==1 || cualProducto==2 || cualProducto==3) {
            Bebida b = exp.comprarBebida(m, cualProducto);
            if (b != null) {
                sonido = b.beber();
            }
            else{
                System.out.println("no se pudo efectuar la compra");
            }
        }
        else if(cualProducto==4 || cualProducto==5){
            Dulce d = exp.comprarDulce(m, cualProducto);
            if(d!=null){
                sonido = d.comer();
            }
            else{
                System.out.println("no se pudo efectuar la compra");
            }
        }


        Moneda v = exp.getVuelto();
        while (v != null) {
            vuelto = v.getValor() + vuelto;
            v = exp.getVuelto();
        }

    }

    public int getvuelto(){return vuelto;}
    public String getSonidob(){return sonido;}
}