public class ConcreteCreator extends Creator {

    public static int v = 0;

    public Product factoryMethod() {
        if (v == 0)
            return new ConcreteProductA();
        else if (v == 1)
            return new ConcreteProductB();
        return null;
    }
}
