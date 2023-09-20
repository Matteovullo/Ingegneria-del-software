public class TestFib {
    public static void main(String[] args) {

        Fib f = Fib.getInstance();
        System.out.println("f " + f.getValue());
        System.out.println(" " + f.getValue());

        Fib f2 = Fib.getInstance();
        System.out.println("f2 " + f2.getValue());
        System.out.println(" " + f2.getValue());

    }
}
