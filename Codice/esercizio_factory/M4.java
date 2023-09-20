package esercizio_factory;

public class M4 implements Product{
    private static int lati=4;

    public int getLati(){return lati;}

    public void stampa(){
        System.out.println("Mattone con 4 lati");
    }
}
