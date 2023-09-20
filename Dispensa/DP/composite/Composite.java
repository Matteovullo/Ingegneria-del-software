import java.util.ArrayList;

import java.util.*;

public class Composite implements Component {

    List<Component> lista = new ArrayList<>();

    public void add(Component o) {
        if (!lista.contains(o)) {
            lista.add(o);
            System.out.println("Aggiunto");
        } else
            System.out.println("Già presente");
    }

    public void remove(Component o) {
        if (lista.contains(o)) {
            lista.remove(o);
            System.out.println("Rimosso");
        } else
            System.out.println("Non presente");
    }

    public void operation() {
        for (Component i : lista)
            i.operation();
    }
}
