import java.util.Observer;
import java.util.Observable;

//ConcreteObserver
public class Monitor implements Observer {
    private int numOperazioni = 0;

    @Override
    public void update(Observable obs, Object s) {
        System.out.println("Monitor: Il saldo e' di euro " + s);
        numOperazioni++;
    }

    public int getNumOperazioni() {
        return numOperazioni;
    }
}