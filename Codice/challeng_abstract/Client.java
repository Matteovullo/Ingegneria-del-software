package challeng_abstract;

public class Client {
    public static void main(String[] arg){
        Creator1 c1=new Creator1();
        Tipo t1=c1.getTipo();
        Lingua l1=c1.getLingua();
        t1.getTipologia(1);
        l1.getPiatto(1);

        Creator2 c2=new Creator2();
        Tipo t2=c2.getTipo();
        Lingua l2=c2.getLingua();
        t2.getTipologia(2);
        l2.getPiatto(2);

        Creator3 c3=new Creator3();
        Tipo t3=c3.getTipo();
        Lingua l3=c3.getLingua();
        t3.getTipologia(5);
        l3.getPiatto(5);

        Creator4 c4=new Creator4();
        Tipo t4=c4.getTipo();
        Lingua l4=c4.getLingua();
        t4.getTipologia(1);
        l4.getPiatto(1);
    }
}
