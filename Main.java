public class Main {
    public static void main(String[] Args) {
        Moneda m = new Moneda100();


        Expendedor e=new Expendedor(2);
        Comprador c=new Comprador(m,1,e);

        e.comprarBebida(m,1);

        System.out.println(c.queBebiste());
        System.out.println(c.cuantoVuelto());

    }
}