// Context

//Il CONTEXT e il CONCRETESTATE decide qual è lo stato successivo e in che modo
//definisce l'interfaccia che interessa al CLIENT e mantiene una istanza di UNA sola
//classe corrente di CONCRETESTATE ( ovvero InPiedi)
//Inoltre il CONTEXT può passare se stesso come argomento all'oggetto CONCRETESTATE
//per appunto inizializzarlo (riga 12)
public class ArchibugereNano{

    private Postura p;

    public ArchibugereNano(){
        p = new InPiedi();
    }

    public void spara(){
        p.fuoco();
    }

    public void alza(){
        p = p.up();
    }

    public void abbassa(){
        p = p.down();
    }
}