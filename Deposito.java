import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> a1;
    private ArrayList<Moneda> a2;
    public Deposito(){
        a1 = new ArrayList();
        a2 = new ArrayList();
    }
    public void addBebida(Bebida b){
        a1.add(b);
    }
    public void addMoneda(Moneda m){
        a2.add(m);
    }
    public Bebida getBebida(){
        if(a1.size() == 0){
            return null;
        }
        else{
            Bebida b = a1.remove(0);
            return b;
        }
    }
    public Moneda getMoneda(){
        if(a2.size() == 0){
            return null;
        }
        else{
            Moneda m = a2.remove(0);
            return m;
        }
    }
}