



public class Main {
    public static void main(String[] Args) throws Exception {
        Moneda m = new Moneda50();


        Expendedor e=new Expendedor(0);
        Comprador c=new Comprador(m,4,e);

        System.out.println(c.getvuelto());
        System.out.println(c.getSonidob());


    }
}