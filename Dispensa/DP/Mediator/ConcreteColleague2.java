public class ConcreteColleague2 implements Colleague {
    private Mediator m;
    private String nome = "ConcreteColleague2";

    public String getNome() {
        return nome;
    }

    public ConcreteColleague2(Mediator _m) {
        m = _m;
    }

    public void send(String msg) {
        System.out.println(this.nome + " invio un messaggio");
        m.comunica(msg);
    }

    public void receive(String msg) {
        System.out.println("Messaggio Ricevuto: " + msg);
    }
}
