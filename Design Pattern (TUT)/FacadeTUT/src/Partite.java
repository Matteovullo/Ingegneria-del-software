//FACADE

//FACADE e' l'interfaccia semplificata per i CLIENT e nasconde gli oggetti del
//sottosistema (classi) creando i metodi che verranno creati all'interno del CLIENT

public class Partite {
    CheatBuster cb = new CheatBuster();
    Server s = new Server(100,56,"DeathMatch");
    ListaUtenti lu = new ListaUtenti();

    public void registra(Giocatore g){
        lu.addID(g);
    }

    public void partecipa(Giocatore g, String mode){
        if(!cb.check(g) && s.getMode() == "DeathMatch"
         && lu.checkID(g)){
            //controlla tutte le condizioni e il metodo check all'interno 
            // di cheatbuster e se non è presente stampa
            
            System.out.println("Il giocatore è entrato in partita");
        } else {
            System.out.println("Il giocatore non è entrato in partita ");
        }
    }

    public void stampaServer(){
        System.out.println(s);
    }

    public void stampaCB(){
        System.out.println(cb);
    }
}
