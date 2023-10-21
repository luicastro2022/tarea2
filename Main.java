



public class Main {
    public static void main(String[] Args) {
        Moneda m = new Moneda1500();


        Expendedor e=new Expendedor(1);
        Comprador c=new Comprador(m,4,e);

        System.out.println(c.getvuelto());
        System.out.println(c.getSonidob());
        try {
            if(m==null){}
        } catch(Exception PagoIncorrectoException){;}


    }
}