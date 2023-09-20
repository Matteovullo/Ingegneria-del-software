public class Persona {

    private String nome;
    private int eta;
    
    public Persona(String n,int e){
        nome = n;
        eta = e;
    }

    public boolean giovane(){
        return eta < 26;
    }

    public int getEta(){
        return eta;
    }
    
    public String getNome(){
        return nome;
    }
    
}
