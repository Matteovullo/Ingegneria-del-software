// Concrete State

public class Salto implements Postura{

    public void fuoco(){
        System.out.println("Il nano non può sparare mentre salta.");
    }

    public void impreca(){
        System.out.println("<<insulto elfo>>");
    }

    public String getName(){
        return "Salto";
    }
}