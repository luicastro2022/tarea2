import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> a1;
    private ArrayList<Moneda> a2;
    private ArrayList<Dulce> a3;
    public Deposito(){
        a1=new ArrayList();
        a2=new ArrayList();
        a3=new ArrayList();
    }

    /**
     *
     * @param b b es un objeto de tipo bebida que se genera al momento de llenar el array con bebidas
     */
    public void addBebida(Bebida b){
        a1.add(b);
    }

    /**
     *
     * @param m m es un objeto del tipo moneda que se genera al momento de llenar el array con monedas
     */
    public void addMoneda(Moneda m){
        a2.add(m);
    }

    /**
     *
     * @param d d es un objeto del tipo dulce que se genera al momento de llenar el array con dulces
     */
    public void addDulce(Dulce d){a3.add(d);}


    /**
     *
     * @return get bebida devuelve la ultima bebida del array si es que existe
     */
    public Bebida getBebida(){
        if(a1.size() == 0){
            return null;
        }
        else{
            Bebida b = a1.remove(0);
            return b;
        }
    }

    /**
     *
     * @return get dulce devuelve el ulitmo dulce del array si es que existe
     */
    public Dulce getDulce() {
        if (a3.size() == 0) {
            return null;
        } else {
            Dulce d = a3.remove(0);
            return d;
        }
    }

    /**
     *
     * @return get moneda devuelve la ultima moneda del array si es que existe
     */
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