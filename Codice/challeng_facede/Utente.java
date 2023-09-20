package challeng_facede;

public class Utente {
    private int IDutente;
    private String nome;
    private String congome;

    public Utente(int _IDutente, String _nome, String _cognome){
        IDutente=_IDutente;
        nome=_nome;
        congome=_cognome;
    }

    public int getID(){return IDutente;}
    public String getNome(){return nome;}
    public String getCognome(){return congome;}
}
