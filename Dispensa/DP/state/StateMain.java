public class StateMain {
    public static void main(String[] args) {
        Context c = new Context();
        c.request();
        c.setState(new ConcreteStateB());
        c.request();
    }
}
