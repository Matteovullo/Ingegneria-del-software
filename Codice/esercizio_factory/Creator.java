package esercizio_factory;

public class Creator {
    public static Product getMattone(int l){
        if(l==3) return new M3();
        else if(l==4) return new M4();
        else if(l==5) return new M5();
        else return new M6();
    }
}
