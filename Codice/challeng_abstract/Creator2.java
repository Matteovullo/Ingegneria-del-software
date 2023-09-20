package challeng_abstract;

public class Creator2 {
    public Tipo getTipo(){
        return new Montagna();
    }
    public Lingua getLingua(){
        return new Inglese();
    }
}
