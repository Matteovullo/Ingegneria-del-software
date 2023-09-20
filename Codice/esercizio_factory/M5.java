package esercizio_factory;

public class M5 implements Product{
    private static int lati=5;
    
    public int getLati(){return lati;}

    public void stampa(){
        System.out.println("Mattone con 5 lati");
    }
}