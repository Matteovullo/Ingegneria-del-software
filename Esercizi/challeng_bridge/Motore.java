public abstract class Motore {
    private Implementor i;

    public void setImplementor(Implementor imp) { this.i = imp; }

    public void on(){
        i.on();
    }

    public void off(){
        i.off();
    }

    public abstract void tipo();
}
