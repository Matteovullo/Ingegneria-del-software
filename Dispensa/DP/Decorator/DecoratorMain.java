public class DecoratorMain {
    public static void main(String[] args) {
        ComponentD a = new ConcreteDecorator(new ConcreteComponent());
        ComponentD semplice = new ConcreteComponent();
        semplice.operation();
        a.operation();
    }
}
