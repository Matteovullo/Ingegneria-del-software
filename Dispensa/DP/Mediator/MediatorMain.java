public class MediatorMain {
    public static void main(String[] args) {
        Mediator m = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague1(m);
        Colleague c2 = new ConcreteColleague2(m);
        m.addColleaugue(c1);
        m.addColleaugue(c2);
        System.out.println();
        c1.send("Ciao sono c1");

    }
}
