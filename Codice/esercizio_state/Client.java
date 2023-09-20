package esercizio_state;

public class Client {
    public static void main(String[] arg){
        Semaforo s=new Semaforo();
        s.modeRosso();
        s.suona();
        s.modeGiallo();
        s.suona();
        s.modeVerde();
        s.suona();
    }
}
