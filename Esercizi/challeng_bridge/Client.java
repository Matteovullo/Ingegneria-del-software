public class Client{
    public static void main(String[] arg){
        Disel d=new Disel();
        Benzina b=new Benzina();
        ImplementorA a=new ImplementorA();
        ImplementorB ib=new ImplementorB();
        d.setImplementor(a);
        b.setImplementor(ib);
        d.tipo();
        b.tipo();
        d.onD();
        d.offD();
        b.onB();
        b.offB();
    }
}