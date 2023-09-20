public class ConcreteObserver implements Observed{
    public void update(Messaggio m, Object o){
        m.notify(o);
    }
}
