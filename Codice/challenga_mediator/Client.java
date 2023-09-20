public class Client {
    public static void main(String[] args){
        ConcreteAlexa a=new ConcreteAlexa();
        Colleague c1=new Cucina();
        Colleague c2=new Bagno();
        Colleague c3=new Cameradaletto();
        a.add(c1);
        a.add(c2);
        a.add(c3);
        a.accenditutto();
        c1.state();
        c2.state();
        c3.state();
        a.spegnitutto();
        c1.state();
        c2.state();
        c3.state();
    }
}