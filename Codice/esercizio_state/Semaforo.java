package esercizio_state;

public class Semaforo{
    private Statosemaforo mode=new Rosso();

    public void suona(){
        mode.suono();
    }

    public void modeRosso(){
        mode=new Rosso();
    }

    public void modeGiallo(){
        mode=new Giallo();
    }

    public void modeVerde(){
        mode=new Verde();
    }
    
}
