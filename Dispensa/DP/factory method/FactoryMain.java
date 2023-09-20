public class FactoryMain {
    public static void main(String[] args) {
        ConcreteCreator c = new ConcreteCreator();
        Product a = c.factoryMethod();
        a.operazione();

    }
}