package DP_Singleton1;

public class ContatoreBeep {
    private static ContatoreBeep c = new ContatoreBeep();

    private int contatore;

    private ContatoreBeep() {
        contatore = 0;
    }

    public void printX() {
        System.out.println("x : " + contatore);
        contatore++;
    }

    public static ContatoreBeep getContatore() {
        return c;
    }

    public void reset() {
        contatore = 0;
    }

    public void incr() {
        contatore++;
    }
}