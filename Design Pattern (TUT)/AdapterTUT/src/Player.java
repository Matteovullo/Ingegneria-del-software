// Client
// I danni del client vanno da 0 a 10.
// I danni dell'adaptee vanno da 0 a 100.

public class Player{

    public static void main (String[] args){
        Goblin g = new TheGoblin();
        g.tiraFreccia(5);

        g.tiraLancia(7);
    }
}