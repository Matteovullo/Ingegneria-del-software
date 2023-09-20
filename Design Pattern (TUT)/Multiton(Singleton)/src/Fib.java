public class Fib{
    private static Fib obj = new Fib();
    private int[] x = { 1,2,3,5,8,13,21,34,55,89,144,233};
    private int i;

    private Fib(){i = 3;}

    public static Fib getIstance(){return obj;}

    public int getValue(){if(1<11)i++;return x[i-1];}

    public void revert(){i=0;}
}