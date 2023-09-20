public class Packaging extends Decor{
    private int i=0;
    public Packaging(String nome, double prezzo){
        super(nome, prezzo);
    }

    public void change(){
        if(i==0) i=1;
        else i=0;
    }

    public void tipo(){
        if(i==0)
        System.out.println("Pack regalo");
        else 
        System.out.println("Pack normale");
    }
}