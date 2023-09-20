package DP_State;

interface Messaggio {
    public String getTesto();
}

class Context {
    private Messaggio m;

    public void getEsteso(String t) {
        m = new Esteso(t);
    }

    public void getCompatto(String t) {
        m = new Compatto(t);
    }

    public String getTesto() {
        return m.getTesto();
    }
}

class Esteso implements Messaggio {
    public String testo;

    public Esteso(String t) {
        testo = t;
    }

    public String getTesto() {
        return testo;
    }
}

class Compatto implements Messaggio {
    public String testo;

    public Compatto(String t) {
        testo = t.substring(0, 10);
    }

    public String getTesto() {
        return testo;
    }
}

class Client {
    public static void main(String[] args) {
        Context c = new Context();

        c.getEsteso("Extended Text");
        // c.getCompatto("Compacted Text");

        System.out.println(c.getTesto());
    }
}