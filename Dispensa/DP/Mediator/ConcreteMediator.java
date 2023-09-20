import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Colleague> lista;

    public ConcreteMediator() {
        this.lista = new ArrayList<>();
    }

    public void addColleaugue(Colleague c) {
        if (!lista.contains(c))
            lista.add(c);
    }

    public void removeColleaugue(Colleague c) {
        if (lista.contains(c))
            lista.remove(c);
    }

    public void comunica(String msg) {
        for (Colleague i : lista) {
            System.out.println("Invio un messaggio a " + i.getNome());
            i.receive(msg);
        }

    }

}
