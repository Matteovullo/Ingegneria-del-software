package DP_AdapterEXT;

//TARGET
interface Goblin {
    public void tiraFreccia(int damage);
}

// ADAPTEE

class PelleVerde {
    public void scagliaPezzoDiLegno(int damage) {
        System.out.println("Inflitti " + damage + " danni.");
    }
}

// ADAPTER
class TheGoblin extends PelleVerde implements Goblin {
    private PelleVerde pv;

    public TheGoblin() {
        pv = new PelleVerde();
    }

    public void tiraFreccia(int damage) {
        scagliaPezzoDiLegno(damage);
    }

    @Override
    public void scagliaPezzoDiLegno(int damage) {
        int adaptedDamage = damage * 10;
        pv.scagliaPezzoDiLegno(adaptedDamage);
    }
}

class Client {

    public static void main(String[] args) {
        Goblin g = new TheGoblin();
        g.tiraFreccia(6);
    }
}
