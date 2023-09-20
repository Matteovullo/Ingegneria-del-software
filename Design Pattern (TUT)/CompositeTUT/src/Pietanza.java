//COMPONENT implementa le operazioni comuni delle sottoclassi (LEAF)
// Dichiara l'operazione per l'accesso alla gestione degli elementi semplici
// e definisce un'operazione che permette ad un elemento di accedere all'oggetto padre
// nella struttura ricorsiva

public abstract class Pietanza{
    protected String nome;
    public abstract void mostra (String indenta);

    public abstract int calcolaCalorie();

    public Pietanza add(Pietanza p) {return this;}

    public Pietanza remove(Pietanza p) {return this;}

    public String getNome() {return nome;}
}