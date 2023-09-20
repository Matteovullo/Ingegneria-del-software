public class Persona{
    private String nome;
    private int eta;
    private String ruolo;

    public Persona(String nom,int et,String ruol){
        nome = nom;
        eta = et;
        ruolo = ruol;
    }

    public boolean giovane(){
        return eta < 28;
    }

    public int getEta(){
        return eta;
    }

    public String getNome(){
        return nome;
    }

    public String getRuolo(){
        return ruolo;
    }

    public boolean isRuolo(String r){
        return ruolo.equals(r);
    }
}