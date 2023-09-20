package DP_Adapter;

//ADAPTER
class Adapter implements Disk {
    private Memoria m;

    public Adapter() {
        m = new Memoria();
    }

    public int getSpazioLibero() {
        return m.getDisponibile();
    }

    public int getSpazioTotale() {
        return (m.getDisponibile() * 100);
    }

    public int getVelocità() {
        return (m.getVelocitàLettura() * m.getVelocitàScrittura());
    }

}

// TARGET
interface Disk {
    public int getSpazioLibero();

    public int getSpazioTotale();

    public int getVelocità();
}

// ADAPTEE

class Memoria {
    public int getDisponibile() {
        return 100;
    }

    public int getVelocitàScrittura() {
        return 100;
    }

    public int getVelocitàLettura() {
        return 20;
    }
}

class Client {
    public static void main(String[] args) {
        Disk d = new Adapter();

        int spazioLibero = d.getSpazioLibero();

        System.out.println("Spazio libero: " + spazioLibero);
    }
}