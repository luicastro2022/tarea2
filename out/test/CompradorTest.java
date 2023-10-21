import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

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
        Moneda m=new Moneda1500();
        Expendedor e=new Expendedor(0);
        Comprador c=new Comprador(m,2,e);
        Assertions.assertNull(c.getSonidob());
        Assertions.assertEquals(1500,c.getvuelto());

    }
    @Test
    void testSinPlata() throws Exception {
        Moneda m=new Moneda50();
        Expendedor e=new Expendedor(1);
        Comprador c=new Comprador(m,3,e);
        Assertions.assertNull(c.getSonidob());
        Assertions.assertEquals(50,c.getvuelto());
    }

}