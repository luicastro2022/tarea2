
class Comprador{
    private String sonido;
    private int vuelto;

    /**
     *
     * @param m es una moneda de cualquier valor
     * @param cualProducto Ingresar el indice que representa cada producto
     * @param exp una referencia al expendedor correspondiente
     * @throws Exception Maneja las excepciones de casos limites
     */
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

    /**
     *
     * @return devuelve el calculo del vuelto
     */
    public int getvuelto(){return vuelto;}

    /**
     *
     * @return devuelve el sonido correspondiente al producto comprado
     */
    public String getSonidob(){return sonido;}
}