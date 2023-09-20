public class Main {
    private static ConcreteCreator cp = new ConcreteCreator();

    public static void main(String[] args){
        Product pos = cp.prendiNumero(0);
        Client c = new Client(pos);
        c.intesta("Mario");
        System.out.println("Costo "+ c.getCosto());

        new Client (cp.prendiNumero(0));
        new Client (cp.prendiNumero(0));
        cp.printPostiOccupati();
    }
}
