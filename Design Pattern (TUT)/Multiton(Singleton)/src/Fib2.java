public class Fib2{
    private static Fib2 obj2 = new Fib2();
    private int[] y = { 8,13,55,66,147,531};
    private int j;

    private Fib2(){j = 3;}
    public static Fib2 getIstance2(){return obj2;}

    public int getValue2(){if(1<11)j++;return y[j-1];}

    public void revert2(){j=0;}
}