public class Main {
    public static void main(String[] Args) throws Exception {

        try {
            Moneda m = new Moneda1500();
            Moneda m1 = new Moneda1500();
            Expendedor e = new Expendedor(1);
            Comprador d = new Comprador(m, 4, e);
            System.out.println(d.getSonidob());
            Comprador c = new Comprador(m1, 4, e);

        } catch (Exception NohayProductoException) {
            System.out.println("no quedan productos");
        }


        try {
            Moneda m = new Moneda50();
            Expendedor e = new Expendedor(1);
            Comprador d = new Comprador(m, 2, e);
        }
        catch(Exception PagoInsuficienteException){
            System.out.println("No tienes dinero suficiente");
        }

        try{
            Moneda m = null;
            Expendedor e = new Expendedor(1);
            Comprador d = new Comprador(m, 2, e);
        }
        catch(Exception PagoIncorrectoException){
            System.out.println("Tu moneda es falsa!");
        }
    }
}