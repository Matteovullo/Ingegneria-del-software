// COLLEAGUE conosce il MEDIATOR,e comunica con il MEDIATOR quando avrebbe comunicato con
// un altro COLLEAGUE
//le classi COLLEAGUE sono riusabili
public class Colleague{
    private Mediator m;
    
    public Colleague (Mediator m){
        this.m = m;
    }

    public void completed (String task){
        m.taskCompleted(task);
    }
}