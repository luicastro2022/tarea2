public class Main {
    public static void main(String[] Args) {
        Moneda m = new Moneda100();


        Expendedor e=new Expendedor(2);
        Comprador c=new Comprador(m,2,e);

        System.out.println(c.getSonidob());
        System.out.println(c.getvuelto());
    }
}