package esercizio_factory;

public class M3 implements Product{
    private static int lati=3;

    public int getLati(){return lati;}

    public void stampa(){
        System.out.println("Mattone con 3 lati");
    } 
}
