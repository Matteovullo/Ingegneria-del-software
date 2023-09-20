public class Context {
    private State statoAttuale;

    public Context() {
        statoAttuale = new ConcreteStateA();
    }

    public void setState(State s) {
        statoAttuale = s;
    }

    public void request() {
        statoAttuale.handle();
    }

}
