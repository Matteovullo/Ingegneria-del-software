package esercizio_factory;

public class Client {
    public static void main(String[] arg){
        Product p=Creator.getMattone(3);
        p.getLati();
        p.stampa();

        p=Creator.getMattone(4);
        p.getLati();
        p.stampa();
    
        p=Creator.getMattone(5);
        p.getLati();
        p.stampa();

        p=Creator.getMattone(6);
        p.getLati();
        p.stampa();
    }
}
