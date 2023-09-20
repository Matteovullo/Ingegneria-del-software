package esercizio_factory;

public class M6 implements Product{
    private static int lati=6;
    
    public int getLati(){return lati;}

    public void stampa(){
        System.out.println("Mattone con 6 lati");
    }
}