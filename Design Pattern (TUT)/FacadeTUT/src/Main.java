//Client

//CLIENT interagisce solo con l'oggetto FACADE invocando i suoi metodi e 

public class Main {

    public static void main (String[] args){
        Giocatore g = new Giocatore(89);
        Partite p = new Partite();

        g.addEquip("Tridente");
        p.stampaServer();
        p.partecipa(g,"DeathMatch");
        p.registra(g);
        p.partecipa(g,"DeathMatch");
        p.registra(g);
        p.partecipa(g,"DeathMatch");


    }
    
}
