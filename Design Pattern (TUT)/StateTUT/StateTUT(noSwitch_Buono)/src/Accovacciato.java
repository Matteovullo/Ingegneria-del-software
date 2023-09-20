public class Accovacciato implements Postura{

    public void fuoco(){
        System.out.println("Sono stati inflitti 100 punti danno.");

    }

    public Postura up(){
        return new InPiedi();
    }

    public Postura down(){
        return new Sdraiato();
    }
}