package challeng_facede;

public class Facede {
    private Registro r=new Registro();

    public void add(Pagamento p){
        r.addPagamento(p);
    }

    public void search(Pagamento p){
        r.searchPagamento(p);
    }
}
