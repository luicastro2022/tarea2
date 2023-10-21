import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CompradorTest {
    @Test
    void testBebida() throws Exception {
        Moneda m=new Moneda1500();
        Expendedor e=new Expendedor(1);
        Comprador c=new Comprador(m,1,e);
        Assertions.assertEquals("cocacola",c.getSonidob());
        Assertions.assertEquals(1400,c.getvuelto());
    }
    @Test
    void testDulce() throws Exception {
        Moneda m=new Moneda1500();
        Expendedor e=new Expendedor(1);
        Comprador c=new Comprador(m,4,e);
        Assertions.assertEquals("snicker",c.getSonidob());
        Assertions.assertEquals(1050,c.getvuelto());
    }
    @Test
    void testSinBebida() throws Exception {
        Exception exception=assertThrows(NoHayProductoException.class,()->{
        Moneda m=new Moneda1500();
        Expendedor e=new Expendedor(0);
        Comprador c=new Comprador(m,2,e);
    });}
    @Test
    void testSinPlata() throws Exception {
        Exception exception = assertThrows(PagoInsuficienteException.class, () -> {
            Moneda m = new Moneda50();
            Expendedor e = new Expendedor(1);
            Comprador c = new Comprador(m, 3, e);

        });
    }

}