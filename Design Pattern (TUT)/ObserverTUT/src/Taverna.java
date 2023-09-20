// Concrete Subject

import java.util.ArrayList;
import java.util.List;
public class Taverna extends Edificio{
    private List<Eroe> eroi = new ArrayList<>();

    //setState()
    public void entra(Eroe e){ //Cambia lo stato del ConcreteSubject
        //quindi deve notificare gli Observer.

        eroi.add(e);
        avvertiSpia();
    }

    //getStateù
    List<Eroe> getEroi(){
        return eroi;
    }


}