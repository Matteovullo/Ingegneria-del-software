// Concrete State

public class Sdraiato implements Postura{

    public void fuoco(){
        System.out.println("Sono stati inflitti 200 punti danno");
    }

    public Postura up(){
        return new Accovacciato();
    }

    public Postura down(){
        return this;
    }
}