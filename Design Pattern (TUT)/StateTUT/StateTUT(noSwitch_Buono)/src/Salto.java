//Concrete State

public class Salto implements Postura{


    public void fuoco(){
        System.out.println("Il nano non può sparare mentre salta");
    }

    public Postura up(){
        return new Sdraiato();
    }

    public Postura down(){
        return new InPiedi();
    }
}