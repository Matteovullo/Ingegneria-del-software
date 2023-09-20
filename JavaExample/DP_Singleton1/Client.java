package DP_Singleton1;

public class Client {
    public static void main(String[] args) {
        ContatoreBeep c = ContatoreBeep.getContatore();

        c.incr();
        c.incr();
        c.printX();
    }
}