package challeng_factory;

public class Figuracreator {
    public Figura getFigura(int i){
        if(i==3) return new Triangolo();
        else if(i==4) return new Quadrato();
        else return new Rettangolo(); 
    }
}
