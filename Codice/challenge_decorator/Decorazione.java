public class Decorazione extends Decor{
    private int i=0;
    public Decorazione(String nome, double prezzo){
        super(nome, prezzo);
    }

    public void change(){
        if(i==0) i=1;
        else i=0;
    }

    public void tipo(){
        if(i==0)
        System.out.println("Decorazione si");
        else 
        System.out.println("Decorazione no");
    }
}
