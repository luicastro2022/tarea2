import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> a1;
    private ArrayList<Dulce> a3;
    private ArrayList<Moneda> a2;
    public Deposito(){
        a1=new ArrayList();
        a2=new ArrayList();
        a3=new ArrayList();
    }

    public void addBebida(Bebida b){
        a1.add(b);
    }
    public void addMoneda(Moneda m){
        a2.add(m);
    }
    public void addDulce(Dulce d){a3.add(d);}


    public Bebida getBebida(){
        if(a1.size() == 0){
            return null;
        }
        else{
            Bebida b = a1.remove(0);
            return b;
        }
    }
    public Dulce getDulce() {
        if (a1.size() == 0) {
            return null;
        } else {
            Dulce d = a3.remove(0);
            return d;
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