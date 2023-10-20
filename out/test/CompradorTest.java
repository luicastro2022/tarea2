import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CompradorTest {
    void testNormal(){
        Moneda m=new Moneda1500();
        Expendedor e=new Expendedor(1);
        Comprador c=new Comprador(m,1,e);

        assertAll()
    }
    @Test
    void testSinBebida(){
        Moneda m=new Moneda1500();
        Expendedor e=new Expendedor(0);
        Comprador c=new Comprador(m,1,e);

        assertAll(
                ()->assertEquals(null,c.getSonidob())
                ()->assertEquals();
        );
    }
}