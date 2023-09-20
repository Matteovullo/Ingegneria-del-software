// Concrete State

public class Sdraiato implements Postura{

    public void fuoco(){
        System.out.println("Sono stati inflitti 200 punti danno");
    }

    public void impreca(){
        System.out.println("Il nano non può insultare gli elfi da accovacciato");
    }

    public String getName(){
        return "Sdraiato";
    }
}