public class Client {
    public static void main(String[] args) {
        ConcreteMessaggio m = new ConcreteMessaggio();
        ConcreteObserver concreteObserver = new ConcreteObserver();
        System.out.println(m.state());
        m.attach(concreteObserver);
        System.out.println(m.state());
    }

}

