public class Decorator implements ComponentD {
    protected ComponentD c;

    public Decorator(ComponentD _c) {
        c = _c;
    }

    public void operation() {
        c.operation();
    }
}
