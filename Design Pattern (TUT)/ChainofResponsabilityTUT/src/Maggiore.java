
//ConcreteHandler
//gestisce la richiesta per cui è responsabile, può accedere al suos uccessore, inoltra la richiesta se non pu gestirla
public class Maggiore extends Ufficiale{
    public Maggiore (Ufficiale succ){
        this.successore = succ;
    }

    public void check (int paga){
        if(paga > 2000)
            successore.check(paga);
        else   
            System.out.println("Il Maggiore viene pagato: " + paga);
    }
}