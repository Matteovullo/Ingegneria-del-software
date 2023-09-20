package esercizio_stringhe;

public class Libro{
    private String nome;
    private double prezzo;
    private int disponibilita;
    private String genere;
    private String ID;

    public Libro(String _nome, double _prezzo, int _disponibilita, String _genere, String _ID){
        nome=_nome;
        prezzo=_prezzo;
        disponibilita=_disponibilita;
        genere=_genere;
        ID=_ID;
    }

    public String getNome(){return nome;}
    public String getID(){return ID;}
    public int getDisponibilita(){return disponibilita;}
    public String getGenere(){return genere;}
    public double getPrezzo(){return prezzo;}
    public void sconto(double x){prezzo-=x;}
    public void setDisponibilita(int x){disponibilita+=x;}
}