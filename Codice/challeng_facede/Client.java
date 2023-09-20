package challeng_facede;

public class Client {
    public static void main(String[] arg){
        Facede f=new Facede();
        Pagamento p=new Pagamento(100, 1520);
        f.add(p);
        f.search(p);
    }
}
