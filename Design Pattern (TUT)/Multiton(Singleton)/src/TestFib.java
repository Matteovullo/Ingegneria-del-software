public class TestFib{
    public static void main(String[] args){
        Fib f = Fib.getIstance();

        System.out.print("f "+f.getValue());
        System.out.println(" " +f.getValue());

        Fib2 f2 = Fib2.getIstance2();

        System.out.print("f2 " + f2.getValue2());
        System.out.println(" " + f2.getValue2());


    }
}