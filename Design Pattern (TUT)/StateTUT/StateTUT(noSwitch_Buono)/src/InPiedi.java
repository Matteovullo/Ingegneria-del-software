//Concrete State
//E' una delle tante sottoclassi che implementano un comportamento associato al Context
public class InPiedi implements Postura{

    public void fuoco() {
        System.out.println("Sono stati infilitti 50 danni");
    }

    public Postura up(){
        return new Salto();
    }

    public Postura down(){
        return new Accovacciato();
    }
}