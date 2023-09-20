public class Client{
    private String nome;
    private final Product pos;

    public Client(Product p){
        pos = p;
    }

    public void intesta(String s){
        nome = s;
    }

    public String getDettagli(){
        return nome.concat(" ").concat(pos.getPosizione());
    }

    public String getNome(){
        return nome;
    }

    public int getCosto(){
        return pos.getCosto();
    }
}