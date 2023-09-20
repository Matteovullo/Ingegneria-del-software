public class Decor implements Prodotto{
    private String nome;
    private double prezzo;

    public Decor(String _nome, double _prezzo){
        nome=_nome;
        prezzo=_prezzo;
    }

    public void printNome(){
        System.out.println(nome);
    }

    public void getPrezzo(){
        System.out.println(prezzo);
    }

    public void tipo(){};
}
