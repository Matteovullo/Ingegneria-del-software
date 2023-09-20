public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(ComponentD c) {
        super(c);
    }

    public void operation() {
        scriviBlu();
        super.operation();
    }

    private void scriviBlu() {
        System.out.println("La scritta è blu: ");
    }
}
