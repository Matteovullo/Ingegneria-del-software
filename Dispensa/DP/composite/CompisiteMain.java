public class CompisiteMain {
    public static void main(String[] args) {
        Component a = new Leaf();
        Component b = new Leaf();
        Composite contenitore = new Composite();
        contenitore.add(a);
        contenitore.add(b);
        contenitore.operation();
    }
}
