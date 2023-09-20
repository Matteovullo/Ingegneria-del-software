package challeng_abstract;

public class Creator1 implements Menu{
    public Tipo getTipo(){
        return new Mare();
    }
    public Lingua getLingua(){
        return new Italiano();
    }
}
