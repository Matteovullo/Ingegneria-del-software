// ConcreteState

public class InPiedi implements Postura{

    public void fuoco(){
        System.out.println("Sono stati infilitti 50 danni.");
    }

    public void impreca(){
        System.out.println("<<insullto elfo>>");
    }

    public String getName(){
        return "InPiedi";
    }

    // Quando è in piedi può imprecare e sparare.
}